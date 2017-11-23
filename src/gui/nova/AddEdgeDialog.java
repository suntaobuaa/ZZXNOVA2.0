package gui.nova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

import org.jgraph.graph.CellView;
import org.jgraph.graph.DefaultEdge;
import org.jgraph.graph.GraphConstants;

import component.nova.MyGraph;
import util.nova.ConstantRepository;
import util.nova.MyGraphConstants;

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
                if(fromcell.getSelectedItem()==null||tocell.getSelectedItem()==null){
                    JOptionPane.showMessageDialog(null, "开始节点与结束节点不能为空");
                }
                else{
                //UtilGUI.checkEqu(fromcell.getSelectedItem().toString(), tocell.getSelectedItem().toString());
                    DefaultEdge edge = new DefaultEdge();
                //设置格式
                int arrow = GraphConstants.ARROW_CLASSIC;
                GraphConstants.setLineEnd(edge.getAttributes(), arrow);
                GraphConstants.setEndFill(edge.getAttributes(), true);
                for (CellView cv : mg.getGraphLayoutCache().getAllViews()) {
                   if(cv.getAllAttributes().get("name")!=null && (cv.getAllAttributes().get("name").equals(fromcell.getSelectedItem().toString()))){
                       edge.setSource(((DefaultMutableTreeNode) cv.getCell()).getChildAt(0));
                       MyGraphConstants.setPartent(edge.getAttributes(), (String) cv.getAllAttributes().get("name"));
                   }
                   if(cv.getAllAttributes().get("name")!=null && (cv.getAllAttributes().get("name").equals(tocell.getSelectedItem().toString()))){
                       edge.setTarget(((DefaultMutableTreeNode) cv.getCell()).getChildAt(0));
                       MyGraphConstants.setChild(edge.getAttributes(),(String) cv.getAllAttributes().get("name"));
                   }
                }
                mg.getGraphLayoutCache().insert(edge);
                dispose();
                }
            }
        });
        
        this.setLayout(null);
        from.setBounds(48, 21, 54, 15);
        this.add(from);
        fromcell.setBounds(137, 18, 106, 21);
        this.add(fromcell);
        to.setBounds(48, 60, 54, 15);
        this.add(to);
        tocell.setBounds(137, 57, 106, 21);
        this.add(tocell);
        ok.setBounds(91, 108, 93, 23);
        this.add(ok);
        this.setSize(300, 180);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setVisible(true);
    }

}
