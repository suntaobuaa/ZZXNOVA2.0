package component.nova;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

/**
 * @ClassName:     MyMenuBar.java
 * @Description:   The MenuBar
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��11��15�� ����10:21:54 
 */
public class MyMenuBar extends JMenuBar{
    public MyMenuBar() {
        // TODO Auto-generated constructor stub
        this.add(new JMenu("����"));
        this.add(new JMenu("����"));
        this.add(new JMenu("���� "));
    }

}
