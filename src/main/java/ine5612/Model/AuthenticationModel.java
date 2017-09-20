/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.Model;

import ine5612.Interface.AuthenticationModelInterface;
import ine5612.Controllers.LoginController;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author 16200923
 */
    

public class AuthenticationModel implements AuthenticationModelInterface {
    protected UserModel user;
    
    public AuthenticationModel(){
        // criar ModelFuncionario e ModelGerente
        
        user = new UserModel("vini","123",false); //true - gerente
       // user = new UserModel("calza","123",false); // false - funcionario
    }
    
    @Override
    public boolean authenticationChecked (String username, String password){
        if(this.user.getUsername().equalsIgnoreCase(username) && this.user.getPassword().equalsIgnoreCase(password)){
        
            return true;
            
        }else{
            JOptionPane.showMessageDialog(null,"Usuário não informado ou não cadastrado\n","Login no sistema", 1);
            //throw new ModelException();
            return false;
        }
    }
    
    @Override
    public Object userObject(){        
        return this.user;
    }
}
