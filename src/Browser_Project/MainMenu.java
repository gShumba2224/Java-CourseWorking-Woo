package Browser_Project;

import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gsm22_000
 */
public class MainMenu extends JMenuBar 
{
    public MainMenu ()
    {
        initMenu();
    }
    
    public void initMenu ()
    {
        JMenu button = null;
        
        button = new JMenu ("File");
        this.add(button);
        
        button = new JMenu ("Edit");
        this.add(button);
        
        button = new JMenu ("Settings");
        this.add(button);
        
        button = new JMenu ("Help");
        this.add(button);
    }
    
    
}
