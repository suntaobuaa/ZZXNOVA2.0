package gui.nova;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
        this.add(new JLabel("south"));
        this.setBorder(BorderFactory.createLineBorder(Color.red));
    }
}
