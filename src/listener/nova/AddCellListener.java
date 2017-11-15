package listener.nova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;

import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;

import component.nova.MyGraph;
import gui.nova.AddCellDialog;
import gui.nova.MainPanel;
import nova.main.MyFrame;

public class AddCellListener implements ActionListener{


    MyFrame partent = null;
    public AddCellListener(MyFrame partent) {
        // TODO Auto-generated constructor stub
        this.partent =partent;
    }
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
//        JButton j = (JButton) e.getSource();
//        MyFrame  main = (MyFrame) j.getRootPane().getParent();
//        MainPanel mp = (MainPanel) main.getCenter();
//        MyGraph mg = mp.getGraph();
//        DefaultGraphCell cell = new DefaultGraphCell("test");
//        GraphConstants.setBounds(cell.getAttributes(), new Rectangle2D.Double(20, 20, 40, 20));
//        mg.getGraphLayoutCache().insert(cell);
          AddCellDialog ap = new AddCellDialog(partent);
    }

}
