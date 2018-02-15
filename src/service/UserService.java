/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Utils.MyConnection;
import Edu.esprit.Entities.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author marwa
 */
public class UserService {

    public static User findUserByEmail(String email) {

        User us = null;
        String requete = "SELECT * FROM user a, user u where a.email=u.email_canonical and a.email=?";
        ResultSet rs;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("email_canonical").equals(email)) {
                    User user = new User(); 
                    if ((user = CRUD.findUserByEmail(email)) != null) {
                        us = new User();
                        us.setId(user.getId());
                        us.setEmail(email);
                        us.setPassword(user.getPassword());
                        us.setNom(user.getNom());
                        us.setPrenom(user.getPrenom());
                        us.setAdresse(user.getAdresse());
                        us.setStatut(user.getEnabled());
                        us.setDate_naiss(user.getDate_naiss());

                    } else {
                        return null;
                    }
                }

            }
            return us;
        } catch (SQLException ex) {
            System.out.println("Erreur de finduserByEmail !\n" + ex.getMessage());
            return null;
        }
    }

     public static User findUserByMail2(String email) {

        User f = null;
        String requete = "SELECT * FROM user where email=?";
        ResultSet rs;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {

                f = new User();
                f.setEmail(email);
                System.out.println("il existe");
                return f;
            }

        } catch (SQLException ex) {
            System.out.println("il n'existe"+ex.getMessage());
        }
        return null;
    }
    
    public static boolean addUser(User a) {

        String requete = "Insert into user(id,email)values(?,?)";
        try {
            
            CRUD.addUser(a);
            int id = CRUD.findUserByEmail(a.getEmail()).getId();
            PreparedStatement ps2 = MyConnection.getInstance().prepareStatement(requete);
            ps2.setInt(1, id);
            ps2.setString(2, a.getEmail());

            ps2.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur d'ajout admin !" + ex.getMessage());
            return false;
        }
    }

    public static boolean deleteUser(String email) {
        String requete = "DELETE from user where email=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, email);
            ps.executeUpdate();
            CRUD.deleteUser(email);
            System.out.println("Suppression avec Succés !");
            return true;

        } catch (SQLException ex) {
            System.out.println("Erreur de Suppression !" + ex.getMessage());
            return false;
        }
    }

    
    public static List<User> listUserDisabled() {
        String requete = "Select * from user u, admin f where u.email_canonical=f.email";
        List<User> list = new ArrayList<User>();
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               User user = CRUD.findUserByEmail(rs.getString(1));
                list.add(user);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("erreur list user" + ex.getMessage());
            return null;
        }
    }
    
    public static ObservableList<User> listEnabledUsers() {
        String requete = "Select * from user u where u.enabled=1";
        ResultSet rs = null;
        User user = new User();
        ObservableList<User> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            rs = ps.executeQuery();
            while (rs.next()) {
                user = CRUD.findUserByEmail(rs.getString(1));
                list.add(user);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("erreur list admin" + ex.getMessage());
            return null;
        }
    }
    
     public static ObservableList<User> listDisabledUsers() {
        String requete = "Select * from user u where u.enabled=0";
        ResultSet rs = null;
        User user = new User();
        ObservableList<User> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            rs = ps.executeQuery();
            while (rs.next()) {
                user = CRUD.findUserByEmail(rs.getString(1));
                list.add(user);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("erreur list admin" + ex.getMessage());
            return null;
        }
    }

}
