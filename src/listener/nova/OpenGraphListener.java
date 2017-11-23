package listener.nova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;

import component.nova.MyGraph;
import util.nova.ConstantRepository;

/**
 * @ClassName:     OpenGraphListener.java
 * @Description:   Open a graph which had been save as a XML file 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午10:05:21 
 */
public class OpenGraphListener implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        MyGraph mg = ConstantRepository.mygraph;
        XMLDecoder xd = null;
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(mg);
        File openfile = jf.getSelectedFile();
        if (openfile == null) return;
        try {
            xd = new XMLDecoder(new  BufferedInputStream(new  FileInputStream(openfile)));
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        mg.getGraphLayoutCache().remove(mg.getRoots());
        mg.updateUI();
        Object[] cells = (Object[]) xd.readObject();
        for(Object cell:cells){
            mg.getGraphLayoutCache().insert(cell);
        }
        xd.close();
    }

}
