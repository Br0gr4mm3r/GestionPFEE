/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import service.CRUD;


/**
 *
 * @author marwa
 *///
public class TESTADMINDAO {
    public static void main(String[] args) {
    // Admin a=new Admin("admin1.devpoint@gmail.com", "ebdelli", "khaled", "elhamma gabes 6020", "1234","1988-04-07");
    //AdminDAO.addAdmin(a);
     //  AdminDAO.updateAdminByLogin(a, "a@a");
        System.out.println(CRUD.findUserByEmail("admin1.devpoint@gmail.com"));
//        AdminDAO.deleteAdmin("aa");
//        AdminDAO.deleteAdmin("a");
    }
}
