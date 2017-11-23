/**
 * 
 */
package component.nova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.rmi.CORBA.Util;
import javax.swing.JButton;
import javax.swing.JToolBar;

import gui.nova.AddCellDialog;
import gui.nova.AddEdgeDialog;
import listener.nova.OpenGraphListener;
import listener.nova.SaveGraphListener;
import util.nova.UtilGUI;

/**
 * @ClassName:     MyToolBar.java
 * @Description:   a ToolBar 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午11:03:45 
 */
public class MyToolBar extends JToolBar{
    /**
     * 
     */
    private JButton button1 = null;
    private JButton button2 = null;
    private JButton button3 = null;
    private JButton button4 = null;
    private JButton button5 = null;
    
    public MyToolBar() {
        // TODO Auto-generated constructor stub
        button1 = new JButton();
        UtilGUI.setImageIcon(button1, "video_play_64.png", "运行工作流");
        button2 = new JButton();
        UtilGUI.setImageIcon(button2, "inbox_64.png", "保存图片");
        button3 = new JButton();
        UtilGUI.setImageIcon(button3, "outbox_64.png", "打开图片");
        button4 = new JButton();
        UtilGUI.setImageIcon(button4, "frame_64.png", "添加节点");
        button5 = new JButton();
        UtilGUI.setImageIcon(button5, "arrow_64.png", "添加连线");
        button2.addActionListener(new SaveGraphListener());
        button3.addActionListener(new OpenGraphListener());
        button4.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                new AddCellDialog();
            }
        });
        button5.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                new AddEdgeDialog();
            }
        });
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.setFloatable(false);
    }

}
