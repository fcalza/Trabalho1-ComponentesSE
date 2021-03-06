package ine5612.View;

import ine5612.Controllers.CommandController;
import ine5612.Controllers.FuncionaryController;
import ine5612.Controllers.LoginController;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author 16200923
 */
public class MainFrame extends JFrame {

    static int valor = 0;
	
    //private static LoginPanel INSTANCE;

    public MainFrame() {
        super();
        if (valor == 0) {
            this.loginPanel();
        }
    }

    public MainFrame(int painel) {

        if (painel == 1) {//painel 1 abre as comandas
            this.ComamandPanel();
        }
        if (painel == 3) {//painel == 3 abre edi��o de uma das comandas
            this.EditCommandPanel();
        }
        valor++;
    }

    public void loginPanel() {
        
        this.add(new LoginPanel(new LoginController()));
        this.pack();
        this.show();
        setTitle("Comanda - Login");
        this.formWindowActivated();

    }

    public void ComamandPanel() {
        this.add(new ComandaPanel());
        this.pack();
        this.show();
        setTitle("Comandas");
        this.formWindowActivated();
        valor++;

    }

    /*public void ManagerPanel() {
        this.add(new EditCommandPanel());
        this.pack();
        this.show();

    }*/
    public void EditCommandPanel() {
        this.add(new EditCommandPanel(new CommandController()));
        this.pack();
        this.show();
        setTitle("Comanda - Editar");
        this.formWindowActivated();
    }

    private void formWindowActivated() {
        // Get the size of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        // Move the window
        this.setLocation(x, y);
    }
    
    public void dispo(){
        this.dispose();
    }
}
