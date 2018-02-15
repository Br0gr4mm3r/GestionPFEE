/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.Entities;

import java.util.Objects;

/**
 *
 * @author iheb
 */
public class fichepfe {
    private int id ; 
    private String nom;
    private String prenom;
    private String sujet;
    private String fonctionnalites;
    private String technologies;
    private int etat;
    private String etablissement;
    private int iduser;

    public fichepfe() {
    }


    public fichepfe(int id,String nom, String prenom, String sujet, String foncionnalites, String technologies, int etat, String etablissement, int iduser) {
        this.id= id;
        this.nom = nom;
        this.prenom = prenom;
        this.sujet = sujet;
        this.fonctionnalites = fonctionnalites;
        this.technologies = technologies;
        this.etat = etat;
        this.etablissement = etablissement;
        this.iduser = iduser;
    }

    public fichepfe(String talel, String torkhani, String sujet, String fonctionnalites, String technologies, int i, String etablissement, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getFonctionnalites() {
        return fonctionnalites;
    }

    public void setFonctionnalites(String fonctionnalites) {
        this.fonctionnalites = fonctionnalites;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    @Override
    public String toString() {
        return "fichepfe{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", sujet=" + sujet + ", fonctionnalites=" + fonctionnalites + ", technologies=" + technologies + ", etat=" + etat + ", etablissement=" + etablissement + ", iduser=" + iduser + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        final fichepfe other = (fichepfe) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.etat != other.etat) {
            return false;
        }
        if (this.iduser != other.iduser) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.sujet, other.sujet)) {
            return false;
        }
        if (!Objects.equals(this.fonctionnalites, other.fonctionnalites)) {
            return false;
        }
        if (!Objects.equals(this.technologies, other.technologies)) {
            return false;
        }
        if (!Objects.equals(this.etablissement, other.etablissement)) {
            return false;
        }
        return true;
    }
    
    
          
    
    
}
