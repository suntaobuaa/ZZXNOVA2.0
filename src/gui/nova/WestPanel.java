package gui.nova;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import listener.nova.AddCellListener;
import listener.nova.AddEdgeListener;
import listener.nova.OpenGraphListener;
import listener.nova.SaveGraphListener;
import nova.main.MyFrame;
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
        addedge.addActionListener(new AddEdgeListener(partent));
        addnode.addActionListener(new AddCellListener(partent));
        save.addActionListener(new SaveGraphListener(partent));
        open.addActionListener(new OpenGraphListener(partent));
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