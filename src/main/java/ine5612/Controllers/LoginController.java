/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.Controllers;

import ine5612.Interface.LoginControlerInterface;
import ine5612.Model.AuthenticationModel;
import ine5612.View.LoginPanel;
import ine5612.View.MainFrame;

/**
 *
 * @author 16200923
 */
public class LoginController implements LoginControlerInterface {
    AuthenticationModel authentication;
    MainFrame mainframe;
    public LoginController(){
        authentication = new AuthenticationModel();
    }
    
    @Override
    public String checkAuthentication (String username,String password){
         if(authentication.authenticationChecked(username,password)){
             authentication.userObject();
             mainframe = new MainFrame(1);//1 comandaPanel
             mainframe.ComamandPanel();
             return "sada";
         } else {
             
             return "No encontrado";
        }
    }
    
    @Override
    public boolean resultAuthentication()    {
        
        return true;
    }
    
 
}

