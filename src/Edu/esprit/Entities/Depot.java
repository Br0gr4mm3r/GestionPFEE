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
public class Depot {
    private int id ;
    private String rapport ; 
    private String executable ;
    private String date ;
    private int iduser ; 
    private String nometudiant ; 

    public Depot(int id, String rapport, String executable, String date, int iduser, String nometudiant) {
        this.id = id;
        this.rapport = rapport;
        this.executable = executable;
        this.date = date;
        this.iduser = iduser;
        this.nometudiant = nometudiant;
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
     * @return the rapport
     */
    public String getRapport() {
        return rapport;
    }

    /**
     * @param rapport the rapport to set
     */
    public void setRapport(String rapport) {
        this.rapport = rapport;
    }

    /**
     * @return the executable
     */
    public String getExecutable() {
        return executable;
    }

    /**
     * @param executable the executable to set
     */
    public void setExecutable(String executable) {
        this.executable = executable;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
