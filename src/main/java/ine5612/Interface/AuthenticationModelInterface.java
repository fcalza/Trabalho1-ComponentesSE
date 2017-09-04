/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.Interface;

/**
 *
 * @author Calza
 */
public interface AuthenticationModelInterface {

    boolean authenticationChecked(String username, String password);

    Object userObject();
    
}
