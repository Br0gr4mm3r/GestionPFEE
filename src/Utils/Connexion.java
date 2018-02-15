/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marwa
 */
public class Connexion {
    public static Connexion instance;//singleton
    private Connection cnn;
    private Connexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Driver
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pfe", "root", "talel123"); //url
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public synchronized static Connexion connectionMeth(){
    if(instance == null){
        instance = new Connexion();
    }
    return instance;
    }

    public Connection getCnn() {
        return cnn;
    }
    public void fermerConnexion(){
        instance = null;
    }
    
}
