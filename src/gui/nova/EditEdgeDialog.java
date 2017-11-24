/**
 * 
 */
package gui.nova;

import javax.swing.JDialog;

import org.jgraph.graph.DefaultEdge;
import org.jgraph.graph.DefaultGraphCell;

/**
 * @ClassName:     EditEdgeDialog.java
 * @Description:   TODO(用一句话描述该文件做什么) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月24日 下午3:36:44 
 * @Place          北京航空航天大学中德软件联合研究所
 */
public class EditEdgeDialog extends JDialog{

    public EditEdgeDialog(DefaultGraphCell cell) {
        // TODO Auto-generated constructor stub
        this.setLayout(null);
        this.setSize(300, 180);
        this.setModal(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
