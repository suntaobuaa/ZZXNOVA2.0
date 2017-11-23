package gui.nova;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;

import component.nova.MyJTree;
import util.nova.ConstantRepository;
/**
 * @ClassName:     WestPanel.java
 * @Description:   Some button such as:addnode,add edge,save ,open 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午10:17:25 
 */
public class WestPanel extends JPanel{

    public WestPanel() {
        // TODO Auto-generated constructor stub
        this.setLayout(new GridLayout(1, 1));
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("项目总览");
        DefaultMutableTreeNode project1 = new DefaultMutableTreeNode("project1");
        DefaultMutableTreeNode project2 = new DefaultMutableTreeNode("project2");
        project1.add(new DefaultMutableTreeNode("graph1"));
        project1.add(new DefaultMutableTreeNode("graph2"));
        project2.add(new DefaultMutableTreeNode("graph3"));
        project2.add(new DefaultMutableTreeNode("graph4"));
        top.add(new DefaultMutableTreeNode("test"));
        top.add(project1);
        top.add(project2);
        this.add(ConstantRepository.jtree = new MyJTree(top));
    }
}