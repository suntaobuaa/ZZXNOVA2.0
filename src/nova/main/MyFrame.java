package nova.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.UIManager;

import component.nova.MyMenuBar;
import component.nova.MyToolBar;
import gui.nova.MainPanel;
import gui.nova.MainSplitPanel;
import gui.nova.SouthPanel;
import gui.nova.WestPanel;

/**
 * @ClassName:     MyFrame.java
 * @Description:   The MainFrame which contain some panel 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午9:57:29 
 */
public class MyFrame extends JFrame{
    private JPanel center = null;
    private JPanel west = null;
    private MyToolBar toolbar = null;
    private MainSplitPanel msp = null;
    public MyFrame() {
        // TODO Auto-generated constructor stub
        //center = new MainPanel();
        toolbar = new MyToolBar();
        msp = new MainSplitPanel(JSplitPane.HORIZONTAL_SPLIT);
        //
        this.setTitle("NOVA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setJMenuBar(new MyMenuBar());
        this.add(toolbar, "North");
        this.add(msp,"Center");
        this.setResizable(false);
        this.setVisible(true);
        this.setSize(1000,620);
        this.setLocationRelativeTo(null);
    }
    public JPanel getCenter() {
        return center;
    }
    public void setCenter(JPanel center) {
        this.center = center;
    }
    public JPanel getWest() {
        return west;
    }
    public void setWest(JPanel west) {
        this.west = west;
    }
}
