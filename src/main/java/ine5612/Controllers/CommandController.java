/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612.Controllers;

import ine5612.View.MainFrame;

/**
 *
 * @author Calza
 */
public class CommandController {

    MainFrame mainFrame;

    public void openEditCommand() {
        mainFrame = new MainFrame(3);
        mainFrame.EditCommandPanel();
    }

   /* public int getSum() {
        int rowCount = comandaTable.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            sum += Integer.parseInt(comandaTable.getValueAt(i, 1).toString());
        }

        return sum;

    }*/

    
}