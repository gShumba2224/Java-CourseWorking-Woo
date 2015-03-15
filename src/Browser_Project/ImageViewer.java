package Browser_Project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author gsm22_000
 */
public class ImageViewer extends JFXPanel 
{
    
    public Label label = new Label () ;
    
    public ImageViewer ( )
    {
        //FXthread ();
        makeScene();
        
    }
    

    
    public Group   makeScene ()
    {

        Group container = new Group ();
        container.getChildren().add(label);
        return (container);
    }
   
}
