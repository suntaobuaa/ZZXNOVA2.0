package listener.nova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.jgraph.graph.CellView;

import component.nova.MyGraph;
import gui.nova.MainPanel;
import nova.main.MyFrame;
import util.nova.ConstantRepository;

/**
 * @ClassName:     SaveGraphListener.java
 * @Description:   Save a Jgraph saved as a XML files 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午10:01:48 
 */
public class SaveGraphListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        MyGraph mg = ConstantRepository.mygraph;
        XMLEncoder xe =null;
        try {
            xe = new XMLEncoder(new  BufferedOutputStream(  
                    new  FileOutputStream("myinfo.xml")));
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Object[] cells = mg.getRoots();
        xe.writeObject(cells);
        xe.close();
    }

}
