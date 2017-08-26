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
    AuthenticationModel authentication = new AuthenticationModel();
    
    public boolean checkAuthentication (String username,String password){
        return authentication.authenticationChecked(username,password);
    }
    
    public boolean resultAuthentication(boolean loginReseult, boolean isManager)    {
        if(loginReseult){
            
            return loginReseult;
        }else{
            return loginReseult;
        }
        
    }
    
 
}

