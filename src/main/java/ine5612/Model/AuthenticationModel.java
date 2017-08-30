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
    protected UserModel user;
    
    public AuthenticationModel(){
        user = new UserModel("Vini","123",true);
    }
    
    public boolean authenticationChecked (String username, String password){
        return this.user.getUsername().equals(username) && this.user.getPassword().equals(password);
    }
    
    public Object userObject(){        
        return this.user;
    }
}
