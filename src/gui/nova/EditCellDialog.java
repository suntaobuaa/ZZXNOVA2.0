/**
 * 
 */
package gui.nova;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jgraph.graph.DefaultGraphCell;

import util.nova.MyGraphConstants;

/**
 * @ClassName:     EditCellDialog.java
 * @Description:   TODO(用一句话描述该文件做什么) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月23日 上午10:31:33 
 * @Place          北京航空航天大学中德软件联合研究所
 */
public class EditCellDialog extends JDialog{
    private JLabel parameter1_name ;
    private JLabel parameter2_name ;
    private JLabel parameter3_name ;
    private JLabel parameter4_name ;
    private JLabel parameter5_name ;
    private JLabel parameter6_name ;
    private JLabel parameter7_name ;
    private JLabel parameter8_name ;
    private JLabel parameter9_name ;
    private JLabel parameter10_name ;
    
    private JTextField parameter1_value = null;
    private JTextField parameter2_value = null;
    private JTextField parameter3_value = null;
    private JTextField parameter4_value = null;
    private JTextField parameter5_value = null;
    private JTextField parameter6_value = null;
    private JTextField parameter7_value = null;
    private JTextField parameter8_value = null;
    private JTextField parameter9_value = null;
    private JTextField parameter10_value = null;

    private JButton button1 = null;
    private JButton button2 =null;
    public EditCellDialog(DefaultGraphCell cell) {
        // TODO Auto-generated constructor stub
        this.setSize(350, 550);
        parameter1_name = new JLabel("parementer1:");
        parameter1_name.setBounds(42, 31, 101, 30);
        parameter2_name = new JLabel("parementer2:");
        parameter2_name.setBounds(42, 71, 101, 30);
        parameter3_name = new JLabel("parementer3:");
        parameter3_name.setBounds(42, 111, 101, 30);
        parameter4_name = new JLabel("parementer4:");
        parameter4_name.setBounds(42, 151, 101, 30);
        parameter5_name = new JLabel("parementer5:");
        parameter5_name.setBounds(42, 191, 101, 30);
        parameter6_name = new JLabel("parementer6:");
        parameter6_name.setBounds(42, 231, 101, 30);
        parameter7_name = new JLabel("parementer7:");
        parameter7_name.setBounds(42, 271, 101, 30);
        parameter8_name = new JLabel("parementer8:");
        parameter8_name.setBounds(42, 311, 101, 30);
        parameter9_name = new JLabel("parementer9:");
        parameter9_name.setBounds(42, 351, 101, 30);
        parameter10_name = new JLabel("parementer10:");
        parameter10_name.setBounds(42, 391, 101, 30);
        //
        parameter1_value = new JTextField((String) MyGraphConstants.getName(cell.getAttributes()));
        parameter1_value.setBounds(151, 36, 141, 30);
        parameter2_value = new JTextField();
        parameter2_value.setBounds(151, 76, 141, 30);
        parameter3_value = new JTextField();
        parameter3_value.setBounds(151, 116, 141, 30);
        parameter4_value = new JTextField();
        parameter4_value.setBounds(151, 156, 141, 30);
        parameter5_value = new JTextField();
        parameter5_value.setBounds(151, 196, 141, 30);
        parameter6_value = new JTextField();
        parameter6_value.setBounds(151, 236, 141, 30);
        parameter7_value = new JTextField();
        parameter7_value.setBounds(151, 276, 141, 30);
        parameter8_value = new JTextField();
        parameter8_value.setBounds(151, 316, 141, 30);
        parameter9_value = new JTextField();
        parameter9_value.setBounds(151, 356, 141, 30);
        parameter10_value = new JTextField();
        parameter10_value.setBounds(151, 396, 141, 30);
        //
        button1 = new JButton("确认");
        button1.setBounds(62, 452, 93, 30);
        button2 = new JButton("取消");
        button2.setBounds(178, 452, 93, 30);
        //
        this.add(parameter1_name);
        this.add(parameter1_value);
        this.add(parameter2_name);
        this.add(parameter2_value);
        this.add(parameter3_name);
        this.add(parameter3_value);
        this.add(parameter4_name);
        this.add(parameter4_value);
        this.add(parameter5_name);
        this.add(parameter5_value);
        this.add(parameter6_name);
        this.add(parameter6_value);
        this.add(parameter7_name);
        this.add(parameter7_value);
        this.add(parameter8_name);
        this.add(parameter8_value);
        this.add(parameter9_name);
        this.add(parameter9_value);
        this.add(parameter10_name);
        this.add(parameter10_value);
        this.add(button1);
        this.add(button2);
        //
        this.setLayout(null);
        this.setModal(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
