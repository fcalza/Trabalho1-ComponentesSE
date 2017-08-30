/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.Controllers;

import ine5612.Model.AuthenticationModel;
import ine5612.View.LoginPanel;

/**
 *
 * @author 16200923
 */
public class LoginController {
    AuthenticationModel authentication;
    
    public LoginController(){
        authentication = new AuthenticationModel();
    }
    
    public String checkAuthentication (String username,String password){
         if(authentication.authenticationChecked(username,password)){
             authentication.userObject();
             return "sada";
         } else {
             return "Não encontrado";
        }
    }
    
    public boolean resultAuthentication()    {
        
        return false;
    }
    
 
}

