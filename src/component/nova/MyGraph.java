package component.nova;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingUtilities;

import org.jgraph.JGraph;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.DefaultGraphModel;

import util.nova.ConstantRepository;

/**
 * @ClassName:     MyGraph.java
 * @Description:   MyGraph extends Jgraph 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午10:22:30 
 */
public class MyGraph extends JGraph{
    private CellPopMenu cmenu;
    public MyGraph(DefaultGraphModel model) {
        // TODO Auto-generated constructor stub
        super(model);
        this.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                if(SwingUtilities.isRightMouseButton(e)){
                    if(getFirstCellForLocation(e.getX(), e.getY())!= null){
                        cmenu = new CellPopMenu((DefaultGraphCell) getFirstCellForLocation(e.getX(), e.getY()));
                        cmenu.show(ConstantRepository.mygraph, e.getX(), e.getY());
                    }
                }
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
        });
    }
}
