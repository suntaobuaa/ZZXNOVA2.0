package listener.nova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.jgraph.graph.DefaultGraphCell;

import component.nova.MyGraph;
import gui.nova.MainPanel;
import nova.main.MyFrame;

public class OpenGraphListener implements ActionListener{
    MyFrame partent = null;
    public OpenGraphListener(MyFrame partent) {
        this.partent = partent;
        
        // TODO Auto-generated constructor stub
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        MainPanel mp = (MainPanel) partent.getCenter();
        MyGraph mg = mp.getGraph();
        XMLDecoder xd = null;
        try {
            xd = new XMLDecoder(new  BufferedInputStream(new  FileInputStream("myinfo.xml")));
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        System.out.println(xd.readObject());
        xd.close();
        System.out.println("ss");
    }

}
