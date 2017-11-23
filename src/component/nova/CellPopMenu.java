/**
 * 
 */
package component.nova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import org.jgraph.graph.DefaultGraphCell;

import util.nova.ConstantRepository;

/**
 * @ClassName:     CellPopMenu.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��11��22�� ����3:34:18 
 * @Place          �������պ����ѧ�е���������о���
 */
public class CellPopMenu extends JPopupMenu{
    JMenuItem edit;
    JMenuItem delete;
    public CellPopMenu(DefaultGraphCell cell) {
        // TODO Auto-generated constructor stub
        Object[] cells = {cell};
        edit = new JMenuItem("�༭");
        delete = new JMenuItem("ɾ��");
        delete.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                ConstantRepository.mygraph.getGraphLayoutCache().remove(cells, false, true);
            }
        });
        this.add(edit);
        this.add(delete);
    }
}
