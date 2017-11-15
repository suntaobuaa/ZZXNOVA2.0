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

public class SaveGraphListener implements ActionListener{
    MyFrame partent = null;
    public SaveGraphListener(MyFrame partent) {
        // TODO Auto-generated constructor stub
        this.partent = partent;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        MainPanel mp = (MainPanel) partent.getCenter();
        MyGraph mg = mp.getGraph();
        XMLEncoder xe =null;
        try {
            xe = new XMLEncoder(new  BufferedOutputStream(  
                    new  FileOutputStream("myinfo.xml")));
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        for(CellView cv : mg.getGraphLayoutCache().getAllViews()){
            xe.writeObject(cv.getCell());
        }
        xe.close();
        System.out.println("±£´æ½áÊø");
    }

}
