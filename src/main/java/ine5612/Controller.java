package ine5612;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller 
{
    public static void main( String[] args ) throws IOException
    {
       Controller controller =  new Controller();
        
    }
    
    public Controller() throws IOException{
        User user = new User();
        user.setUsername("Vini");
        user.setPassword("123");
        user.setUserType(1);
        
        try {
            ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("../"));
            oss.writeObject(user);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       // System.out.println( "Hello World!" );
    }
}
