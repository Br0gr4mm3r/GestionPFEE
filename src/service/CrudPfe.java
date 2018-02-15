/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Edu.esprit.Entities.fichepfe;
import Utils.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IdeaPad
 */
public class CrudPfe {
    
    
    public static boolean addFiche(fichepfe f) throws SQLException {
       
        String requete1 = "INSERT INTO `fichepfe` (`nom`, `prenom`, `sujet`, `fonctionnalites`, `technologies`, `etat`, `etablissement`, `iduser`) VALUES (?,?,?,?,?,?,?,?)";
      
        try {
            PreparedStatement ps1=MyConnection.getInstance().prepareStatement(requete1);
            ps1.setString(1, f.getNom());
            ps1.setString(2, f.getPrenom());
            ps1.setString(3, f.getSujet());
            ps1.setString(4, f.getFonctionnalites());
            ps1.setString(5, f.getTechnologies());
            ps1.setInt(6, f.getEtat());
            ps1.setString(7, f.getEtablissement());
            ps1.setInt(8, f.getIduser());
                       
            ps1.executeUpdate();
            
            System.out.println("Ajout avec succes !");
            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur d'ajout "+ex.getMessage());
            return false;
        }
    }
    
    
    
    public static boolean deleteFiche(int id){
        String requete="DELETE from fichepfe where id=?";
        
        try {
            PreparedStatement ps=MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
                System.out.println("Suppression avec Succés !");
                return true;
            
        } catch (SQLException ex) {
            System.out.println("Erreur de Suppression !"+ex.getMessage());
            return false;
        }
    }
    
    
    public static boolean updateUserByLogin(fichepfe f, String email){
            String requete="Update fichepfe set nom=?,prenom=?,sujet=?,fonctionnalites=?,technologies=?,etat=?,etablissement=?  where id=?";           
          
            try {
                PreparedStatement ps1 = MyConnection.getInstance().prepareStatement(requete);
                ps1.setString(1, f.getNom());
            ps1.setString(2, f.getPrenom());
            ps1.setString(3, f.getSujet());
            ps1.setString(4, f.getFonctionnalites());
            ps1.setString(5, f.getTechnologies());
            ps1.setInt(6, f.getEtat());
            ps1.setString(7, f.getEtablissement());
            ps1.setInt(8, f.getIduser());
                ps1.executeUpdate();
                System.out.println("Mise à jour effectuée avec succès !");
                return true;
            } catch (SQLException ex) {
                System.out.println("Erreur de Mise a jour !\n"+ex.getMessage());
                return false;
            }
    }
    
    
    
     public static List<fichepfe> listePFe ()
    {
        List<fichepfe> list =new ArrayList<>() ; 
        String req="SELECT *  FROM fichepfe" ; 
        try { 
            PreparedStatement ps1 = MyConnection.getInstance().prepareStatement(req);
            ResultSet result =ps1.executeQuery() ; 
            while (result.next()){
            list.add(new fichepfe(result.getInt("id"),
                                   result.getString("nom"),
                                   result.getString("prenom"),
                                   result.getString("sujet"),
                                   result.getString("fonctionnalites"),
                                   result.getString("technologies"),
                                   result.getInt("etat"),
                                   result.getString("etablissement"),
                                   result.getInt("iduser"))) ; 
            }
            
        } catch (SQLException ex) {
            
        }
    return list ; 
      }

  
}
