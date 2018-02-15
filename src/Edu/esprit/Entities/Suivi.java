/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.Entities;

import java.util.Date;

/**
 *
 * @author iheb
 */
public class Suivi {
    private int id ;
    private Date datedebut ; 
    private Date datefin;
    private int avancement ; 
    private int iduser ; 

    public Suivi(int id, Date datedebut, Date datefin, int avancement, int iduser) {
        this.id = id;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.avancement = avancement;
        this.iduser = iduser;
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
     * @return the datedebut
     */
    public Date getDatedebut() {
        return datedebut;
    }

    /**
     * @param datedebut the datedebut to set
     */
    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    /**
     * @return the datefin
     */
    public Date getDatefin() {
        return datefin;
    }

    /**
     * @param datefin the datefin to set
     */
    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    /**
     * @return the avancement
     */
    public int getAvancement() {
        return avancement;
    }

    /**
     * @param avancement the avancement to set
     */
    public void setAvancement(int avancement) {
        this.avancement = avancement;
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

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Suivi other = (Suivi) obj;
        return this.iduser == other.iduser;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.iduser;
        return hash;
    }

    @Override
    public String toString() {
        return "suivi{" + "id=" + id + ", datedebut=" + datedebut + ", datefin=" + datefin + ", avancement=" + avancement + ", iduser=" + iduser + '}';
    }

 

    

   
    
    
}
