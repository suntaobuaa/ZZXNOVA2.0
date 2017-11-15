package gui.nova;

import java.awt.GridLayout;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.DefaultGraphModel;
import org.jgraph.graph.GraphConstants;

import component.nova.MyGraph;

public class MainPanel extends JPanel{
    private MyGraph graph = null;
    public MainPanel() {
        this.setLayout(new GridLayout(1, 1));
        graph = new MyGraph(new DefaultGraphModel());
        this.add(graph);
    }
    public MyGraph getGraph() {
        return graph;
    }
    public void setGraph(MyGraph graph) {
        this.graph = graph;
    }
}
