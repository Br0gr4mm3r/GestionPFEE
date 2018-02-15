/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;


import Utils.MyConnection;
import Edu.esprit.Entities.User;
import Tests.TESTUserDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author marwa
 */
public class CRUD {
   
    public static boolean addUser(User a){
        
        String requete1 = "INSERT INTO `hotel-1`.`user` (`email_canonical`, `password`, `nom`, `prenom`, `adresse`, `date_naiss`, `username`, `username_canonical`, `locked`, `expired`, `enabled`, `roles`, `credentials_expired`, `type` ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String Date_naiss = a.getDate_naiss();
        java.util.Date utilDate = null;
        try {
            utilDate = formatter.parse(Date_naiss);
        } catch (java.text.ParseException ex) {
            Logger.getLogger(TESTUserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            PreparedStatement ps1=MyConnection.getInstance().prepareStatement(requete1);
            ps1.setString(1, a.getEmail());
            ps1.setString(2, a.getPassword());
            ps1.setString(3, a.getNom());
            ps1.setString(4, a.getPrenom());
            ps1.setString(5, a.getAdresse());
            ps1.setDate(6, new java.sql.Date(utilDate.getTime()));
            ps1.setString(7, a.getUsername());
            ps1.setString(8, a.getUsername_canonical());
            ps1.setInt(9, a.getLocked());
            ps1.setInt(10, a.getExpired());
            ps1.setInt(11, a.getStatut());
            ps1.setString(12, a.getRoles());
            ps1.setInt(13, a.getCredentials_expired());
            ps1.setString(14, a.getType());
            
            ps1.executeUpdate();
            
            System.out.println("Ajout avec succes !");
            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur d'ajout "+ex.getMessage());
            return false;
        }
    }
    
    public static boolean deleteUser(String email){
        String requete="DELETE from user where email_canonical=?";
        
        try {
            PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, email);
            ps.executeUpdate();
                System.out.println("Suppression avec Succés !");
                return true;
            
        } catch (SQLException ex) {
            System.out.println("Erreur de Suppression !"+ex.getMessage());
            return false;
        }
    }
    
    public static boolean updateUserByLogin(User u , String email){
            String requete="Update user set password=?,nom=?,prenom=?,adresse=?,date_naiss=?  where email_canonical=?";           
           SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String Date_naiss = u.getDate_naiss();
        java.util.Date utilDate = null;
        try {
            utilDate = formatter.parse(Date_naiss);
        } catch (java.text.ParseException ex) {
            Logger.getLogger(TESTUserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
                PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                ps.setString(1, u.getPassword());
                ps.setString(2, u.getNom());
                ps.setString(3, u.getPrenom());
                ps.setString(4, u.getAdresse());
                ps.setDate(5,new java.sql.Date(utilDate.getTime())); 
                ps.setString(6, CRUD.findUserByEmail(email).getEmail()); 
                ps.executeUpdate();
                System.out.println("Mise à jour effectuée avec succès !");
                return true;
            } catch (SQLException ex) {
                System.out.println("Erreur de Mise a jour !\n"+ex.getMessage());
                return false;
            }
    }
    
     public static void ToggleBloquer(String email) throws SQLException{
            String requete="Update user set enabled=?  where email_canonical=?";           
           User a = findUserByEmail(email);
           
           try {
             if (a.getStatut() == 1) {
                 PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                 ps.setInt(1, 0);
                 ps.setString(2, email);
                 ps.executeUpdate();
                 System.out.println("Utilisateur locked !");
             } else {
                 PreparedStatement ps2 = MyConnection.getInstance().prepareStatement(requete);
                 ps2.setInt(1, 1);
                 ps2.setString(2, email);
                 ps2.executeUpdate();
                 System.out.println("Utilisateur enabled !");
             }
         } catch (SQLException sQLException) {
             System.out.println("lock error !!!!!!!!");
         }         
     }
    
    public static User findUserByEmail(String email){
        String requete="Select * from user where email_canonical=?";
        User user=new User();
        ResultSet rs=null;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,email);
            rs=ps.executeQuery();
            System.out.println("OK");
            while (rs.next())
            {
               
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
                if(rs.getString("email_canonical").equals(email)){
                    
                user.setId(rs.getInt("id"));
                user.setEmail(email);
                user.setPassword(rs.getString("password"));
                user.setNom(rs.getString("nom"));
                user.setPrenom(rs.getString("prenom"));
                user.setAdresse(rs.getString("adresse"));
                user.setDate_naiss( formatter.format(rs.getDate("date_naiss")));
                user.setUsername(rs.getString("username"));
                user.setUsername_canonical(rs.getString("username_canonical"));
                user.setLocked(rs.getInt("locked"));
                user.setExpired(rs.getInt("expired"));
                user.setStatut(rs.getInt("enabled"));
                user.setRoles(rs.getString("roles"));
                user.setCredentials_expired(rs.getInt("credentials_expired"));
                user.setType(rs.getString("type"));
                user.setStatut(rs.getInt("enabled"));
                System.out.println(user.getEmail_canonical());
                return user;
                }
                
            }
            return null;
            
            } catch (SQLException ex) {
            System.out.println("Login n'existe pas.\n"+ex.getMessage());
            return null;
        }
    }
    
    public static User findUserEnabled(String email){
        String requete="Select * from user u where u.enabled=true";
        User user=new User();
        ResultSet rs=null;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,email);
            rs=ps.executeQuery();
            System.out.println("OK");
            while (rs.next())
            {
               
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
                if(rs.getString("email_canonical").equals(email)){
                    
                user.setId(rs.getInt("id"));
                user.setEmail(email);
                user.setPassword(rs.getString("password"));
                user.setNom(rs.getString("nom"));
                user.setPrenom(rs.getString("prenom"));
                user.setAdresse(rs.getString("adresse"));
                user.setDate_naiss( formatter.format(rs.getDate("date_naiss")));
                user.setUsername(rs.getString("username"));
                user.setUsername_canonical(rs.getString("username_canonical"));
                user.setLocked(rs.getInt("locked"));
                user.setExpired(rs.getInt("expired"));
                user.setStatut(rs.getInt("enabled"));
                user.setRoles(rs.getString("roles"));
                user.setCredentials_expired(rs.getInt("credentials_expired"));
                user.setType(rs.getString("type"));
                user.setStatut(rs.getInt("enabled"));
                System.out.println(user.getEmail_canonical());
                return user;
                }
                
            }
            return null;
            
            } catch (SQLException ex) {
            System.out.println("Login n'existe pas.\n"+ex.getMessage());
            return null;
        }
    }
    
    
    public static ObservableList<User> listUsers(){
        String requete="Select * from user";
        
        try {
            ObservableList<User> listUsers = FXCollections.observableArrayList();
            PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                User user = CRUD.findUserByEmail(rs.getString("email_canonical"));
                 user.setStatut(rs.getInt("enabled"));
                listUsers.add(user);
            }
            return listUsers;
        } catch (SQLException ex) {
            System.out.println("Erreur List Users !"+ex);
            return null;
        }
    }
    
     public static boolean updateDateLogin(String email) {

        String requete = "Update user set last_login=? where email_canonical=?";
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setDate(1, sqlDate);
            ps.setString(2, email);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur de mise a jour\n" + ex.getMessage());
            return false;
        }
    }

    public static String getUserLastLogin(String email) {
        String requete = "Select last_login from user where email_canonical=?";
        java.sql.Date sqlDate = null;
        ResultSet rs;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                sqlDate = rs.getDate(1);
            }
            return sqlDate+"";
        } catch (SQLException ex) {
            System.out.println("Erreur de mise a jour\n" + ex.getMessage());
            return null;
        }
    }

}
  