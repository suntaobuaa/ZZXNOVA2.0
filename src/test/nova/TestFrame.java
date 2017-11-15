package test.nova;

import javax.swing.JFrame;

import org.jgraph.graph.DefaultGraphCell;
import listener.nova.TestListener;

public class TestFrame{
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(1000, 600);
        jf.setVisible(true);
        DefaultGraphCell dg = new DefaultGraphCell("aaa");
        System.out.println(jf.getComponentCount());
    }
}
