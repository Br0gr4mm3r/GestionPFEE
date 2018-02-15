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
public  class User {
    int id;
     String email_canonical;
     String nom;
     String prenom;
     String adresse;
     String password;
     String date_naiss;
     String last_login;
     String username;
     String username_canonical;
     int locked;
     int expired;
     int enabled;
     String roles;
     int credentials_expired;
     String type;

    public User(String email_canonical, String nom, String prenom, String adresse, String password, String date_naiss, String username, String username_canonical, int locked, int expired, int enabled, String roles, int credentials_expired, String type) {
        this.email_canonical = email_canonical;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.password = password;
        this.date_naiss = date_naiss;
        this.username = username;
        this.username_canonical = username_canonical;
        this.locked = 0;
        this.expired = 0;
        this.enabled = enabled;
        this.roles = roles;
        this.credentials_expired = 0;
        this.type = type;
    }

     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email_canonical;
    }

    public void setEmail(String email_canonical) {
        this.email_canonical = email_canonical;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(String date_naiss) {
        this.date_naiss = date_naiss;
    }

    public String getLast_login() {
        return last_login;
    }

    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername_canonical() {
        return username_canonical;
    }

    public void setUsername_canonical(String username_canonical) {
        this.username_canonical = username_canonical;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public int getExpired() {
        return expired;
    }

    public void setExpired(int expired) {
        this.expired = expired;
    }

    public int getStatut() {
        return enabled;
    }

    public void setStatut(int enabled) {
        this.enabled = enabled;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public int getCredentials_expired() {
        return credentials_expired;
    }

    public void setCredentials_expired(int credentials_expired) {
        this.credentials_expired = credentials_expired;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail_canonical() {
        return email_canonical;
    }

    public void setEmail_canonical(String email_canonical) {
        this.email_canonical = email_canonical;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

  
    public User(){}
    
}
    

