package gui.nova;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.tree.DefaultMutableTreeNode;

import org.jgraph.graph.CellView;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;

import component.nova.MyGraph;
import component.nova.MyGraphCell;
import util.nova.ConstantRepository;
import util.nova.MyGraphConstants;
import util.nova.UtilGUI;

/**
 * @ClassName:     AddCellDialog.java
 * @Description:   A AddCellDialog 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午10:20:35 
 */
public class AddCellDialog extends JDialog {
    private JLabel name = null;
    private JTextField text = null;
    private JButton ok = null;
    private String s = null;
    MyGraph mg = null;

    public AddCellDialog() {
        // TODO Auto-generated constructor stub
        name = new JLabel("请输入节点名称：");
        text = new JTextField();
        ok = new JButton("确认");
        mg = ConstantRepository.mygraph;
        ok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                s = text.getText().trim();
                //插入cell
                if (UtilGUI.checkEmpty(s, "节点名称")&&checkCellexistence(s, mg)) {
                    DefaultGraphCell cell = new MyGraphCell();
                    cell.setUserObject(s);
                    MyGraphConstants.setName(cell.getAttributes(), s);
                    GraphConstants.setGradientColor(cell.getAttributes(), Color.CYAN);
                    GraphConstants.setOpaque(cell.getAttributes(), true);
                    GraphConstants.setBounds(cell.getAttributes(), new Rectangle2D.Double(20, 20, 60, 40));
                    cell.addPort();
                    mg.getGraphLayoutCache().insert(cell);
                    dispose();
                }
            }
        });
        name.setBounds(42, 33, 96, 15);
        text.setBounds(150, 29, 69, 23);
        ok.setBounds(87, 84, 93, 23);
        this.add(name);
        this.add(text);
        this.add(ok);
        this.setLayout(null);
        this.setSize(300, 180);
        this.setModal(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public boolean checkCellexistence(String s,MyGraph mg){
        for (CellView cv : mg.getGraphLayoutCache().getAllViews()) {
            if(cv.getAllAttributes().get("name")!=null&&(cv.getAllAttributes().get("name").equals(s))){
                JOptionPane.showMessageDialog(null, "该节点名称已存在");
                return false;
            }
         }
        return true;
    }
}
