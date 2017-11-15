package gui.nova;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.DefaultGraphModel;
import org.jgraph.graph.GraphConstants;

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
        this.add(graph);
    }
}
