package Browser_Project;
import java.io.File;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gsm22_000
 */
public class customMutableTreeNode extends DefaultMutableTreeNode  {
    
    protected String filePath = null;
    
    public customMutableTreeNode ()
    {
        super ();
    }
    
    public void setFilePath (File file)
    {
        this.filePath = file.getPath();
    }
    
    public String getFilePath ()
    {
        return (this.filePath);
    }
    
}
