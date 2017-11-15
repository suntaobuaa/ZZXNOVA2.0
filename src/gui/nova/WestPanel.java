package gui.nova;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import listener.nova.OpenGraphListener;
import listener.nova.SaveGraphListener;
import nova.main.MyFrame;
/**
 * @ClassName:     WestPanel.java
 * @Description:   Some button such as:addnode,add edge,save ,open 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午10:17:25 
 */
public class WestPanel extends JPanel{

    public WestPanel() {
        // TODO Auto-generated constructor stub
        this.setBorder(BorderFactory.createLineBorder(Color.red));
    }
}