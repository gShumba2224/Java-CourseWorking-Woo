package Browser_Project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TreeView;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.control.TreeItem;

/**
 *
 * @author gsm22_000
 */
public class FXthreader {
    
    public FXthreader (JFXPanel panel)
    {


    }
    public void FXthread (JFXPanel panel, Scene scene)
    {
        Platform.runLater(new Runnable ()
        {
            @Override
            public void run (JFXPanel panel, Scene scene)
            {
                Scene scene = makeScene (); 
                panel.setScene(scene);
            } 
        });
    }
    

    }

