/**
 * 
 */
package gui.nova;

import javax.swing.JDialog;

import org.jgraph.graph.DefaultEdge;
import org.jgraph.graph.DefaultGraphCell;

/**
 * @ClassName:     EditEdgeDialog.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��11��24�� ����3:36:44 
 * @Place          �������պ����ѧ�е���������о���
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
