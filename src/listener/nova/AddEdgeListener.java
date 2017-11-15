package listener.nova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.nova.AddEdgeDialog;
import nova.main.MyFrame;

public class AddEdgeListener implements ActionListener {
    MyFrame partent = null;

    public AddEdgeListener(MyFrame partent) {
        // TODO Auto-generated constructor stub
        this.partent = partent;
    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //    JButton j = (JButton) e.getSource();
        //    MyFrame  main = (MyFrame) j.getRootPane().getParent();
        //    MainPanel mp = (MainPanel) main.getCenter();
        //    MyGraph mg = mp.getGraph();
        //    DefaultGraphCell cell = new DefaultGraphCell("test");
        //    GraphConstants.setBounds(cell.getAttributes(), new Rectangle2D.Double(20, 20, 40, 20));
        //    mg.getGraphLayoutCache().insert(cell);
        AddEdgeDialog ap = new AddEdgeDialog(partent);
    }

}
