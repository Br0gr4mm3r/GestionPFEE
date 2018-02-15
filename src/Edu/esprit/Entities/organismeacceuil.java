/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.Entities;

/**
 *
 * @author iheb
 */
public class organismeacceuil {
    private int id ;
    private String nom ;
    private String categorie ; 
    private String adresse ; 
    private String email ; 
    private String numTelephone ; 

    public organismeacceuil(int id, String nom, String categorie, String adresse, String email, String numTelephone) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.adresse = adresse;
        this.email = email;
        this.numTelephone = numTelephone;
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the categorie
     */
    public String getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the numTelephone
     */
    public String getNumTelephone() {
        return numTelephone;
    }

    /**
     * @param numTelephone the numTelephone to set
     */
    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
