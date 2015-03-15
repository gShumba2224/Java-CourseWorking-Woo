package Browser_Project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.EventQueue;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;

import Browser_Project.*;
import Browser_Project.Tests;
import Browser_Project.MainMenu;

/**
 *
 * @author gsm22_000
 */
public class MainWindow  extends JFrame
{
    
    
    public static JFrame window = window = new JFrame(); 
    public static Container fullPane = window.getContentPane();
    public static MainMenu mainMenu  = new MainMenu();
    
    
    
    public static JPanel northPane = new JPanel();
    public static JPanel sidePane  ;
    public static JPanel centrePane = new JPanel();
    public static JPanel bottomPane = new JPanel();
    
    public static String filePath = null;
    

  
    public static  void createWindowSwing ()
    { 
        window.setTitle("Amazing Wicked Browser Wooo Yeah");
        window.setSize(750,750);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fullPane.setLayout(new BorderLayout());
        fullPane.add(mainMenu, BorderLayout.NORTH);
        
        fullPane.add(  swingSideBar (), BorderLayout.WEST);
    

        
        //fullPane.add(centrePane, BorderLayout.CENTER);
        fullPane.add(bottomPane, BorderLayout.CENTER);
        
       
        
        window.setVisible (true);
        
    }
    
    public static JTabbedPane swingSideBar ()
    { 
        GridLayout grid = new GridLayout (1,1); 
        String tempFile = "C:\\Users\\gsm22_000\\Desktop";
        FileBrowser fileBrowser = new FileBrowser(tempFile);
        JScrollPane browserScroll = new JScrollPane (fileBrowser);
        
        JTabbedPane basePanel = new JTabbedPane ();
        JPanel browserPanel = new JPanel ();
        browserPanel.setLayout(grid);
        
        browserPanel.add(browserScroll);
        basePanel.addTab("File Viewer", browserPanel);

        return (basePanel);
    }
        

   
    public static void main(String[] args) 
        {
            createWindowSwing ();
            
/*
            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                //initMainWindow ();
                createWindowSwing ();
                //addSwingWidgets ();
               // sortPanes ();
                //createFXthread ();
    
                }
            });
*/
        }

     public static void createFXthread ()
    {
         Platform.runLater(new Runnable ()
        {
            @Override
            public void run ()
            {
              createFXscene ();
            } 
        });
    }
     
    public static void createFXscene ()
    {
        Tests x = new Tests ();
        Scene scene = x.getScene();
        //imageViewerPanel.setScene(scene); 
    }

}
