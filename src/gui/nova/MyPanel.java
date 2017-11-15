package gui.nova;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
    private JFrame frame = null;

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    
}
