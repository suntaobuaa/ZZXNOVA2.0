package gui.nova;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @ClassName:     SouthPanel.java
 * @Description:   I don't konw
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午10:18:31 
 */
public class SouthPanel extends JPanel{

    public SouthPanel() {
        // TODO Auto-generated constructor stub
        this.setMinimumSize(new Dimension(0, 0));
        this.setLayout(new GridLayout(1, 1));
        this.add(new JTextArea());
    }
}
