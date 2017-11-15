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
 * @Date           2017年11月15日 上午10:21:54 
 */
public class MyMenuBar extends JMenuBar{
    public MyMenuBar() {
        // TODO Auto-generated constructor stub
        this.add(new JMenu("保存"));
        this.add(new JMenu("运行"));
        this.add(new JMenu("帮助 "));
    }

}
