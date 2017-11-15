package gui.nova;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SouthPanel extends JPanel{

    public SouthPanel() {
        // TODO Auto-generated constructor stub
        this.add(new JLabel("south"));
        this.setBorder(BorderFactory.createLineBorder(Color.red));
    }
}
