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
 enum Mention {faible,passable,assez_bien , bien , tres_bien , excellent ; }

public class diplome {
    private int id ; 
    private String nomEtudiant ; 
    private Mention mention ; 
    private String dateEmission ; 
    private int iduser ; 
    private int idsoutenance ;

    public diplome(int id, String nomEtudiant, Mention mention, String dateEmission, int iduser, int idsoutenance) {
        this.id = id;
        this.nomEtudiant = nomEtudiant;
        this.mention = mention;
        this.dateEmission = dateEmission;
        this.iduser = iduser;
        this.idsoutenance = idsoutenance;
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
     * @return the nomEtudiant
     */
    public String getNomEtudiant() {
        return nomEtudiant;
    }

    /**
     * @param nomEtudiant the nomEtudiant to set
     */
    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    /**
     * @return the mention
     */
    public Mention getMention() {
        return mention;
    }

    /**
     * @param mention the mention to set
     */
    public void setMention(Mention mention) {
        this.mention = mention;
    }

    /**
     * @return the dateEmission
     */
    public String getDateEmission() {
        return dateEmission;
    }

    /**
     * @param dateEmission the dateEmission to set
     */
    public void setDateEmission(String dateEmission) {
        this.dateEmission = dateEmission;
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
     * @return the idsoutenance
     */
    public int getIdsoutenance() {
        return idsoutenance;
    }

    /**
     * @param idsoutenance the idsoutenance to set
     */
    public void setIdsoutenance(int idsoutenance) {
        this.idsoutenance = idsoutenance;
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
