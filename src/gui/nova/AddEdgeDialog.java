package gui.nova;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.tree.DefaultMutableTreeNode;

import org.jgraph.graph.CellView;
import org.jgraph.graph.DefaultEdge;
import org.jgraph.graph.GraphConstants;

import component.nova.MyGraph;
import util.nova.ConstantRepository;

/**
 * @ClassName:     AddEdgeDialog.java
 * @Description:   The AddEdgeDialog 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午10:09:05 
 */
public class AddEdgeDialog extends JDialog {
    private JLabel from = null;
    private JLabel to = null;
    private JComboBox fromcell = null;
    private JComboBox tocell = null;
    private JButton ok = null;
    private List<String> cellname = new ArrayList<String>();

    public AddEdgeDialog() {
        // TODO Auto-generated constructor stub
        from = new JLabel("from:");
        to = new JLabel("to:");
        MyGraph mg = ConstantRepository.mygraph;
        //读取图上已经存在的组件名称
        for (CellView cv : mg.getGraphLayoutCache().getAllViews()) {
            cellname.add((String) cv.getAllAttributes().get("name"));
        }
        fromcell = new JComboBox(cellname.toArray());
        tocell = new JComboBox(cellname.toArray());
        ok = new JButton("确认");
        ok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //                //插入cell
                DefaultEdge edge = new DefaultEdge();
                //设置格式
                int arrow = GraphConstants.ARROW_CLASSIC;
                GraphConstants.setLineEnd(edge.getAttributes(), arrow);
                GraphConstants.setEndFill(edge.getAttributes(), true);
                for (CellView cv : mg.getGraphLayoutCache().getAllViews()) {
                   if(cv.getAllAttributes().get("name")!=null&&(cv.getAllAttributes().get("name").equals(fromcell.getSelectedItem().toString()))){
                       edge.setSource(((DefaultMutableTreeNode) cv.getCell()).getChildAt(0));
                   }
                   if(cv.getAllAttributes().get("name")!=null&&(cv.getAllAttributes().get("name").equals(tocell.getSelectedItem().toString()))){
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

}
