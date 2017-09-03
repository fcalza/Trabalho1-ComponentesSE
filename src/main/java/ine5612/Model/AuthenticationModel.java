/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.Model;

import ine5612.Controllers.LoginController;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author 16200923
 */
    

public class AuthenticationModel {
    protected UserModel user;
    
    public AuthenticationModel(){
        user = new UserModel("vini","123",true);
    }
    
    public boolean authenticationChecked (String username, String password){
        if(this.user.getUsername().equalsIgnoreCase(username) && this.user.getPassword().equalsIgnoreCase(password)){
        
            return true;
            
        }else{
            JOptionPane.showMessageDialog(null, "Usuário incorreto");
            return false;
        }
    }
    
    public Object userObject(){        
        return this.user;
    }
}
