package gui.nova;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jgraph.graph.CellView;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;

import component.nova.MyGraph;
import nova.main.MyFrame;
import util.nova.MyGraphConstants;

public class AddCellDialog extends JDialog{
    private JLabel name = null;
    private JTextField text = null;
    private JButton ok = null;
    private MyFrame partent = null;
    public AddCellDialog(MyFrame partent) {
        // TODO Auto-generated constructor stub
        this.setPartent(partent);
        name = new JLabel("请输入节点名称：");
        text = new JTextField();
        ok = new JButton("确认");
        ok.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
              String s = text.getText().trim();
              //插入cell
              MyFrame  main =  getPartent();
              MainPanel mp = (MainPanel) main.getCenter();
              MyGraph mg = mp.getGraph();
              DefaultGraphCell cell = new DefaultGraphCell(s);
              MyGraphConstants.setName(cell.getAttributes(), s);
              GraphConstants.setBounds(cell.getAttributes(), new Rectangle2D.Double(20, 20, 40, 20));
              cell.addPort();
              mg.getGraphLayoutCache().insert(cell);
//              for(CellView cv : mg.getGraphLayoutCache().getAllViews()){
//                  System.out.println(cv.getAllAttributes().toString());
//              }
              dispose();
            }
        });
        this.setLayout(new GridLayout(3, 1));
        this.add(name);
        this.add(text);
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
