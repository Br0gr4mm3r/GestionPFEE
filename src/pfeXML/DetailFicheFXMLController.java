/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfeXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 * FXML Controller class

 */
public class DetailFicheFXMLController implements Initializable {
    @FXML
    private Label nomLabel;
    @FXML
    private Label prenomLabel;
    @FXML
    private Label SujetLabel;
    @FXML
    private Label FonctionnalitesLabel;
    @FXML
    private Label TechnologiesLabel;
    @FXML
    private Label EtatLabel;
    @FXML
    private Label EtablissementLabel;
    @FXML
    private Button edit;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
      
    }    

    public Label getNomLabel() {
        return nomLabel;
    }

    public void setNomLabel(String nomLabel) {
        this.nomLabel.setText(nomLabel);
    }

    public Label getPrenomLabel() {
        return prenomLabel;
    }

    public void setPrenomLabel(String prenomLabel) {
        this.prenomLabel.setText(prenomLabel);
    }

    public Label getSujetLabel() {
        return SujetLabel;
    }

    public void setSujetLabel(String SujetLabel) {
        this.SujetLabel .setText(SujetLabel);
    }

    public Label getFonctionnalitesLabel() {
        return FonctionnalitesLabel;
    }

    public void setFonctionnalitesLabel(String FonctionnalitesLabel) {
        this.FonctionnalitesLabel.setText(FonctionnalitesLabel);
    }

    public Label getTechnologiesLabel() {
        return TechnologiesLabel;
    }

    public void setTechnologiesLabel(String TechnologiesLabel) {
        this.TechnologiesLabel.setText(TechnologiesLabel);
    }

    public Label getEtatLabel() {
        return EtatLabel;
    }


    public void setEtatLabel(String EtatLabel) {
        this.EtatLabel.setText(EtatLabel);
    }

    public Label getEtablissementLabel() {
        return EtablissementLabel;
    }

    public void setEtablissementLabel(String EtablissementLabel) {
        this.EtablissementLabel.setText(EtablissementLabel);
    }


    

   



  
    
   

    
    
    
    
}
