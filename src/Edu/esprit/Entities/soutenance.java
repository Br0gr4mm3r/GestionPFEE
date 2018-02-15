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
public class soutenance {
    private int id ; 
    private String rapporteur ; 
    private String encadrant ; 
    private String presidentJury ; 
    private String type ; 
    private String nometudiant ; 
    private int iduser ; 
    private int etat ; 

    public soutenance(int id, String rapporteur, String encadrant, String presidentJury, String type, String nometudiant, int iduser, int etat) {
        this.id = id;
        this.rapporteur = rapporteur;
        this.encadrant = encadrant;
        this.presidentJury = presidentJury;
        this.type = type;
        this.nometudiant = nometudiant;
        this.iduser = iduser;
        this.etat = etat;
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
     * @return the rapporteur
     */
    public String getRapporteur() {
        return rapporteur;
    }

    /**
     * @param rapporteur the rapporteur to set
     */
    public void setRapporteur(String rapporteur) {
        this.rapporteur = rapporteur;
    }

    /**
     * @return the encadrant
     */
    public String getEncadrant() {
        return encadrant;
    }

    /**
     * @param encadrant the encadrant to set
     */
    public void setEncadrant(String encadrant) {
        this.encadrant = encadrant;
    }

    /**
     * @return the presidentJury
     */
    public String getPresidentJury() {
        return presidentJury;
    }

    /**
     * @param presidentJury the presidentJury to set
     */
    public void setPresidentJury(String presidentJury) {
        this.presidentJury = presidentJury;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the nometudiant
     */
    public String getNometudiant() {
        return nometudiant;
    }

    /**
     * @param nometudiant the nometudiant to set
     */
    public void setNometudiant(String nometudiant) {
        this.nometudiant = nometudiant;
    }

    /**
     * @return the iduser
     */
    public int getIduser() {
        return iduser;
    }

    /**
     * @param iduser the iduser to set
     */
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    /**
     * @return the etat
     */
    public int getEtat() {
        return etat;
    }

    /**
     * @param etat the etat to set
     */
    public void setEtat(int etat) {
        this.etat = etat;
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
