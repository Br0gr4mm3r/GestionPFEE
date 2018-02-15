/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;


import Edu.esprit.Entities.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jrockit.jfr.parser.ParseException;
import service.UserService;
/**
 *
 * @author marwa
 */
public class TESTUserDAO {
    public static void main(String[] args) {
      
        
        List<User> l2 = UserService.listUserDisabled();
        for (User s :l2 ) {
            System.out.println(s.getStatut());
    }
    }
    
}
