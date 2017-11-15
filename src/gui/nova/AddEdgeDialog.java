package gui.nova;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.tree.DefaultMutableTreeNode;

import org.jgraph.graph.CellView;
import org.jgraph.graph.DefaultEdge;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;

import component.nova.MyGraph;
import nova.main.MyFrame;
import util.nova.MyGraphConstants;

public class AddEdgeDialog extends JDialog {
    private JLabel from = null;
    private JLabel to = null;
    private JComboBox fromcell = null;
    private JComboBox tocell = null;
    private JButton ok = null;
    private MyFrame partent = null;
    private List<String> cellname = new ArrayList<String>();

    public AddEdgeDialog(MyFrame partent) {
        // TODO Auto-generated constructor stub
        this.setPartent(partent);
        from = new JLabel("from:");
        to = new JLabel("to:");
        MyFrame main = getPartent();
        MainPanel mp = (MainPanel) main.getCenter();
        MyGraph mg = mp.getGraph();
        for (CellView cv : mg.getGraphLayoutCache().getAllViews()) {
            cellname.add((String) cv.getAllAttributes().get("name"));
        }
        fromcell = new JComboBox(cellname.toArray());
        tocell = new JComboBox(cellname.toArray());
        ok = new JButton("»∑»œ");
        ok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //                //≤Â»Îcell
                DefaultEdge edge = new DefaultEdge();
                int arrow = GraphConstants.ARROW_CLASSIC;
                GraphConstants.setLineEnd(edge.getAttributes(), arrow);
                GraphConstants.setEndFill(edge.getAttributes(), true);
                for (CellView cv : mg.getGraphLayoutCache().getAllViews()) {
                   if(cv.getAllAttributes().get("name")!=null&&(cv.getAllAttributes().get("name").equals(fromcell.getSelectedItem().toString()))){
                       System.out.println("2");
                       edge.setSource(((DefaultMutableTreeNode) cv.getCell()).getChildAt(0));
                   }
                   if(cv.getAllAttributes().get("name")!=null&&(cv.getAllAttributes().get("name").equals(tocell.getSelectedItem().toString()))){
                       System.out.println(3);
                       edge.setTarget(((DefaultMutableTreeNode) cv.getCell()).getChildAt(0));
                   }
                }
                // Fetch the ports from the new vertices, and connect them with the edge
                //                edge.setSource(edge.getChildAt(0));
                //                edge.setTarget(cells[1].getChildAt(0));
                //                MyGraphConstants.setName(cell.getAttributes(), "s");
                //                GraphConstants.setBounds(cell.getAttributes(), new Rectangle2D.Double(20, 20, 40, 20));
                mg.getGraphLayoutCache().insert(edge);
                //              for(CellView cv : mg.getGraphLayoutCache().getAllViews()){
                //                  System.out.println(cv.getAllAttributes().toString());
                //              }
                dispose();
            }
        });
        this.add(from);
        this.add(fromcell);
        this.add(to);
        this.add(tocell);
        this.setLayout(new GridLayout(5, 1));
        this.add(ok);
        this.setSize(200, 300);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setVisible(true);
    }

    public MyFrame getPartent() {
        return partent;
    }

    public void setPartent(MyFrame partent) {
        this.partent = partent;
    }
}
