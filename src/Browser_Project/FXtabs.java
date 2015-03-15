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
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author gsm22_000
 */
public class FXtabs <anyType> extends JFXPanel {
    
    public anyType inputPanel; 
    public Group container = new Group();
    public Scene scene = new Scene ( container);
    public TabPane tabPane = new TabPane();
    
    public  FXtabs (anyType widget)
    {
         this.inputPanel = widget;
        FXthread ();
    }

    public void FXthread ()
    {
        Platform.runLater(new Runnable ()
        {
            @Override
            public void run ()
            {
                makeScene (); 
                //FXtabs.super.setScene(scene);
            } 
        });
    }
    

    public void makeScene ()
    {
        FXtabs.super.setScene(this.scene);
    }
        
        
    public  Scene addTabs (anyType inputPanel, String tabText)
    {
        Tab tab = new Tab (tabText);
        tab.setContent((node)inputPanel);

        return (scene);
        
    }
    
}
