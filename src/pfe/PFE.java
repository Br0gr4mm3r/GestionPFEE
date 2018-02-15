/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import Edu.esprit.Entities.fichepfe;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import service.CrudPfe;

/**
 *
 * @author esprit
 */
public class PFE extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn = new Button();
        //btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
          //      System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       CrudPfe crud = new CrudPfe();
       //launch(args);
       fichepfe f = new fichepfe();
       
    f.setNom("Talel");
    f.setPrenom("Talel");
    f.setSujet("Talel");
    f.setFonctionnalites("Talel");
    f.setTechnologies("test");
    f.setEtat(1);
    f.setEtablissement("sqqdqs");
    f.setIduser(1);

    crud.addFiche(f);
    crud.deleteFiche(3);

    
        System.out.println(crud.listePFe().toString());

    }
    
}
