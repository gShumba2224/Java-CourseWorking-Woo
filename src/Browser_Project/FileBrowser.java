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
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import Browser_Project.customMutableTreeNode;
import javafx.scene.control.Label;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import Browser_Project.ImageViewer;

/**
 *
 * @author gsm22_000
 */

public class FileBrowser extends JTree
{   

  
   
    public static String  upDate = null;
    
    public FileBrowser (String rootPath) //, ImageViewer imageViewer)
   {
       super( generateTree(rootPath));
       this.upDate = upDate;
       eventControl();
   }


   private static  MutableTreeNode generateTree(String rootPath )
   {
      File  currentFile = new File (rootPath);
      customMutableTreeNode subTree = new customMutableTreeNode();
      subTree.setUserObject( currentFile.getName());
      subTree.setFilePath(currentFile);
      
      if (currentFile.isDirectory())
         for (File item: currentFile.listFiles())
            subTree.add( generateTree(item.getPath() ));
      
      return (subTree );

   }

   private  void eventControl ( )
   {
       this.getSelectionModel().addTreeSelectionListener
        ( new  TreeSelectionListener()
        {
           @Override
            public void valueChanged(TreeSelectionEvent e)
            {
              performAction (e);
            }
        });
      
   }
   
   private String  performAction(TreeSelectionEvent e)
   {
       customMutableTreeNode selectedElement =(customMutableTreeNode) e.getPath().getLastPathComponent();
       System.out.print (selectedElement.getFilePath());
  
       return (this.upDate );
      
   }
   

   

}

    
