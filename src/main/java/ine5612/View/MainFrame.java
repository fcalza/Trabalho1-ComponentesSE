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