/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.View;

import ine5612.Controllers.LoginController;
import javax.swing.JFrame;

/**
 *
 * @author 16200923
 */
public class MainFrame extends JFrame {
    public MainFrame(){
        super();
        
        this.add(new LoginPanel(new LoginController()));
        this.pack();
        this.show();
    }
}
