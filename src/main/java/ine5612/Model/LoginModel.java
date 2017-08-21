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
    

public class LoginModel {
    protected String name,pass;
    // typeUser 1 == Gerente; 0 == Funcionario;
    protected int userType; 
    
    
    public LoginModel(){
        this.name = "Login";
        this.pass = "password";
        this.userType = 1; 
    }
    
    
    private Object authentication (String username, String password){
        LoginModel user = new LoginModel(); 
        user.name = username;
        user.pass = password;
        return user;
    }
    
    
}
