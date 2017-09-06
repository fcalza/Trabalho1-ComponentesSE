/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.Controllers;

import ine5612.View.ComandaPanel;
import ine5612.View.EditCommandPanel;
import ine5612.View.MainFrame;

/**
 *
 * @author Calza
 */
public class CommandController {

    MainFrame mainFrame;
    ComandaPanel comandaPanel;
    double sum;
    
    public void openEditCommand() {
        mainFrame = new MainFrame(3);
        mainFrame.EditCommandPanel();
    }
    
    public void setSum(double sumVallue){
        sum = sumVallue;
    }
    public double getSum() {
       
        return sum;

    }

    public void AttClienteTabble() {
        //comandaController = new ComandaController();
        comandaPanel.setValueTabbleClient();
    }

    
    
}