package ine5612;

import ine5612.View.MainFrame;
import ine5612.View.LoginPanel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main 
{
    public static void main( String[] args ) throws IOException
    {
      new MainFrame();
    }
    
    public Main() {
       System.out.println( "Hello World!" );
    }
}
