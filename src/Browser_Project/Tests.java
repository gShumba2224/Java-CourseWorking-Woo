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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author gsm22_000
 */
public class Tests
{
    public Text  text  =  new  Text();

    public Tests()
    {

    }

    public  Scene getScene() 
    {
          Group  root  =  new  Group();
          Scene  scene  =  new  Scene(root, Color.ALICEBLUE);

          text.setX(40);
          text.setY(100);
          text.setFont(new Font(25));
          text.setText("Welcome JavaFX!");

          root.getChildren().add(text);

          return (scene);
      }
}
    