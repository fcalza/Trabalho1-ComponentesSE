/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.Model;

import ine5612.Controllers.LoginController;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author 16200923
 */
    

public class AuthenticationModel {
    
    private String username, password;
    private boolean isManager;
    LoginController loginController = new LoginController();

    public AuthenticationModel(){
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean authenticationChecked (String username, String password){
        String usernameT = "Vini";
        String passwordT = "123";
        isManager = true;
        
        if(usernameT.equals(username) && passwordT.equals(password)){
            System.out.println("Login efetuado com sucesso");
           
            return loginController.resultAuthentication(true,isManager);
        } else {
            System.out.println("Login errado");
            return loginController.resultAuthentication(false,isManager);
        }
    }
    
}
