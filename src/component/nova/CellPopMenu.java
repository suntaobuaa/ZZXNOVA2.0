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
 * @Description:   TODO(用一句话描述该文件做什么) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月22日 下午3:34:18 
 * @Place          北京航空航天大学中德软件联合研究所
 */
public class CellPopMenu extends JPopupMenu{
    JMenuItem edit;
    JMenuItem delete;
    public CellPopMenu(DefaultGraphCell cell) {
        // TODO Auto-generated constructor stub
        Object[] cells = {cell};
        edit = new JMenuItem("编辑");
        delete = new JMenuItem("删除");
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
