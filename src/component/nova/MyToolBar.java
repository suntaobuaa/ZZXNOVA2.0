/**
 * 
 */
package component.nova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

import gui.nova.AddCellDialog;
import gui.nova.AddEdgeDialog;
import listener.nova.OpenGraphListener;
import listener.nova.SaveGraphListener;

/**
 * @ClassName:     MyToolBar.java
 * @Description:   a ToolBar 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��11��15�� ����11:03:45 
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
        button1 = new JButton("��ʼ");
        button2 = new JButton("����");
        button3 = new JButton("��");
        button4 = new JButton("��ӽڵ�");
        button5 = new JButton("�������");
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
