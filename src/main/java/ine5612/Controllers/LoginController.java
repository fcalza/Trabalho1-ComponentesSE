/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.Controllers;

import ine5612.Model.AuthenticationModel;
import ine5612.View.LoginPanel;
import ine5612.View.MainFrame;

/**
 *
 * @author 16200923
 */
public class LoginController {
    AuthenticationModel authentication;
    MainFrame mainframe;
    public LoginController(){
        authentication = new AuthenticationModel();
    }
    
    public String checkAuthentication (String username,String password){
         if(authentication.authenticationChecked(username,password)){
             authentication.userObject();
             MainFrame mainframe = new MainFrame(1);//1 comandaPanel
             mainframe.ComamandPanel();
             return "sada";
         } else {
             
             return "No encontrado";
        }
    }
    
    public boolean resultAuthentication()    {
        
        return true;
    }
    
 
}

