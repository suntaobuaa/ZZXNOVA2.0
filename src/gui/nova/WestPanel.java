package gui.nova;

import java.awt.Color;
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
    JButton addnode = null;
    JButton addedge = null;
    JButton save = null;
    JButton open = null;
    MyFrame partent = null;
    public WestPanel(MyFrame partent) {
        // TODO Auto-generated constructor stub
        setPartent(partent);
        this.setLayout(new GridLayout(4, 10));
        addnode = new JButton("添加节点");
        addedge = new JButton("添加连线");
        save = new JButton("保存");
        open = new JButton("打开");
        addedge.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                AddEdgeDialog ap = new AddEdgeDialog();
            }
        });
        addnode.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                AddCellDialog ap = new AddCellDialog();
            }
        });
        save.addActionListener(new SaveGraphListener());
        open.addActionListener(new OpenGraphListener());
        this.add(addnode);
        this.add(addedge);
        this.add(save);
        this.add(open);
        this.setBorder(BorderFactory.createLineBorder(Color.red));
    }
    public MyFrame getPartent() {
        return partent;
    }
    public void setPartent(MyFrame partent) {
        this.partent = partent;
    }
}