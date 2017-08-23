/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.Model;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author 16200923
 */
    

public class AuthenticationModel {
    
    private String username, password;
    private boolean isManager;
    
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
        
        if(usernameT == username && passwordT == password){
            System.out.println("Login efetuado com sucesso");
            return true;
        } else {
            System.out.println("Login errado");
            return false;
        }
    }
    
}
