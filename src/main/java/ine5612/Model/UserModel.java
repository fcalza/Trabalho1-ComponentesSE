/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.Model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 16200923
 */
public class UserModel {
    private String username;
    private String password;
    private boolean isManager;
    //private Map<String, UserModel> map;;

    //subistituir por map
    public UserModel(String usarname, String password, boolean isManager){
        this.username = usarname;
        this.password = password;
        this.isManager = isManager;
        //this.map = new HashMap<String, UserModel>();

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
    
     public boolean isManager() {
        return isManager;
    }

    public void setIsManager(boolean isManager) {
        this.isManager = isManager;
    }
}
