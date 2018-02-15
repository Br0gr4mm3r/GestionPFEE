/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import Utils.MyConnection;
import Edu.esprit.Entities.Admin;
import Edu.esprit.Entities.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author marwa
 */
public class AdminService {
      
public static Admin findAdminByLogin(String email){
     
     Admin admin=null;
     String requete = "SELECT * FROM admin a, user u where a.email=u.email_canonical and a.email=?";
     ResultSet rs;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, email);
            rs=ps.executeQuery();
            while(rs.next()){
                    if(rs.getString("email_canonical").equals(email)){
                        User user=CRUD.findUserByEmail(email); 
                            if((user!=null)){
                                admin=new Admin();
                                admin.setId(user.getId());
                                admin.setEmail(email);
                                admin.setPassword(user.getPassword());
                                admin.setNom(user.getNom());
                                admin.setPrenom(user.getPrenom());
                                admin.setAdresse(user.getAdresse());
                                admin.setDate_naiss(user.getDate_naiss());
                                
                            }
                            else{
                                return null;
                            }
                    }
                    
            }  
            return admin;
        } 
        catch (SQLException ex) {
            return null;
        }
}
     
    public static boolean addAdmin(Admin a){
        
        
        String requete = "Insert into admin(email)values(?)";
        try {           
            CRUD.addUser(a);
            PreparedStatement ps2=MyConnection.getInstance().prepareStatement(requete);
            ps2.setString(1, a.getEmail());
            ps2.executeUpdate();
            CRUD.getUserLastLogin(a.getEmail());
            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur d'ajout admin !");
            return false;
        }
    }
    
    public static boolean deleteAdmin(String login){
        String requete="DELETE from admin where email=?";
        
        try {
            PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ps.executeUpdate();
            CRUD.deleteUser(login);
                System.out.println("Suppression avec Succés !");
                return true;
            
        } catch (SQLException ex) {
            System.out.println("Erreur de Suppression !"+ex.getMessage());
            return false;
        }
    }
    
    public static boolean updateAdminByLogin(Admin a,String email){
            String requete="Update admin set email=? where email=?";           
            try {
                CRUD.updateUserByLogin(a,email);
                PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);  
                ps.setString(1, a.getEmail());
                ps.setString(2, email); 
                ps.executeUpdate();
                System.out.println("Mise à jour effectuée avec succès !");
                return true;
            } catch (SQLException ex) {
                System.out.println("Erreur de Mise a jour !\n"+ex.getMessage());
                return false;
            }
    }
    
    public static void setAdminPassword(String email,String Password){
        Admin admin=new Admin();
        admin=findAdminByLogin(email);
        admin.setPassword(Password);
        CRUD.updateUserByLogin(admin ,email);
        System.out.println(admin);
    }
    
    
   
    
    public List<User>listAdministrateur(){
        String requete="Select * from hotel-1.user u,hotel-1.admin a where u.email=a.email";
        ResultSet rs=null;
        User user=new User();
        List<User>list=new ArrayList<User>();
        try {
            PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
            rs=ps.executeQuery();
            while(rs.next()){
                user=CRUD.findUserByEmail(rs.getString(1));
                list.add(user);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("erreur list admin"+ex.getMessage());
            return null;
        }
    }
    
    
}
