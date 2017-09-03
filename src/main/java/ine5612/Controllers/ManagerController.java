/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.Controllers;

import ine5612.Model.UserModel;
import ine5612.View.MainFrame;

/**
 *
 * @author Calza
 */
public class ManagerController {

    UserModel user;
    ;

    public ManagerController() {
        //if (user.isManager()) {
            MainFrame mainFrame = new MainFrame(3);
            mainFrame.EditCommandPanel();
       // }
    }
}
