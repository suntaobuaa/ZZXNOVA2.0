package gui.nova;

import java.awt.GridLayout;

import javax.swing.JPanel;

import component.nova.MyGraph;
import util.nova.ConstantRepository;

/**
 * @ClassName:     MainPanel.java
 * @Description:   This panel contain a graph which used to draw a new graph
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午10:19:22 
 */
public class MainPanel extends JPanel{
    private MyGraph graph = null;
    /**
     * 
     */
    public MainPanel() {
        this.setLayout(new GridLayout(1, 1));
        graph = ConstantRepository.mygraph;
        graph.setInvokesStopCellEditing(true);
        graph.setEditClickCount(Integer.MAX_VALUE);
        this.add(graph);
    }
}
