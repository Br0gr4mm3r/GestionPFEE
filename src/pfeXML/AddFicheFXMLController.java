/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfeXML;

import Edu.esprit.Entities.fichepfe;
import service.CrudPfe;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;



/**
 * FXML Controller class
 *
 * @author Amir
 */
public class AddFicheFXMLController implements Initializable {
    @FXML
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private Button addBtn;
    
    private Stage stage;
    @FXML
    private TextField sujet;
    @FXML
    private TextField fonctionnalites;
     @FXML
    private TextField technologies;
    
    @FXML
    private TextField etat;
   
    @FXML
    private TextField etablissement;
    
           /**
     * Initializes the controller class.
     */
    
   @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
               

    } 
    
    
    @FXML
    private void addFiche(ActionEvent event) throws IOException {
          CrudPfe c = new CrudPfe();
          fichepfe f=new fichepfe();
          f.setNom(nom.getText());
          f.setPrenom(prenom.getText());
          f.setSujet(sujet.getText());
          f.setFonctionnalites(fonctionnalites.getText());
          f.setTechnologies(technologies.getText());
          f.setEtat(Integer.valueOf(etat.getText()));
          f.setEtablissement(etablissement.getText());
          f.setIduser(1);
        //f.setSujet(Integer.valueOf(age.getText()));
        
       try {
              CrudPfe.addFiche(f);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
       
       
       FXMLLoader loader = new FXMLLoader(getClass().getResource("DetailFicheFXML.fxml"));
        
        Parent root = loader.load();
        
        DetailFicheFXMLController ficheController = loader.getController();
        ficheController.setNomLabel(nom.getText());
        ficheController.setPrenomLabel(prenom.getText());
        ficheController.setSujetLabel(sujet.getText());
        ficheController.setFonctionnalitesLabel(fonctionnalites.getText());
        ficheController.setTechnologiesLabel(technologies.getText());
        ficheController.setEtatLabel(etat.getText());
        ficheController.setEtablissementLabel(etablissement.getText());
        
       
        nom.getScene().setRoot(root);
        
    }
    
    

 
     

    
}
    
