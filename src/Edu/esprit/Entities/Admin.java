/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.Entities;



/**
 *
 * @author marwa
 */
  public class Admin extends User{

    public Admin(String email_canonical, String nom, String prenom, String adresse, String password, String date_naiss, String username, String username_canonical, int locked, int expired, int enabled, String roles, int credentials_expired, String type) {
        super(email_canonical,nom,prenom,adresse,password,date_naiss,username,username_canonical,locked,expired,enabled,roles,credentials_expired,type);
    }


    public Admin() {
    }

    @Override
    public String toString() {
        return "Info Administrateur :\nEmail : "+getEmail()+"\nPassword : "+getPassword()+"\nInfo Personnel :\nNom & Prenom : "+getNom()+" "+getPrenom()+"\nAdresse : "+getAdresse();
    }
    
}

