/**
 * 
 */
package util.nova;

import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * @ClassName:     UtilGUI.java
 * @Description:   TODO(用一句话描述该文件做什么) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 下午6:53:55 
 * @Place          北京航空航天大学中德软件联合研究所
 */
public class UtilGUI {
    private static String imageFolder = "./img";
    
    public static void setImageIcon(JButton b, String fileName, String tip) {
        ImageIcon i = new ImageIcon(new File(imageFolder, fileName).getAbsolutePath());
        Image smalli = i.getImage();
        smalli = smalli.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        i.setImage(smalli);
        b.setIcon(i);
        //b.setPreferredSize(new Dimension(61, 81));
        b.setToolTipText(tip);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setHorizontalTextPosition(JButton.CENTER);
    }
    //检查是否数字
    public static boolean checkNumber(String tf, String input) {
        if (!checkEmpty(tf, input))
            return false;
        String text = tf;
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, input + " 需要是整数");
            return false;
        }
    }
    //判断是否空
    public static boolean checkEmpty(String tf, String input) {
        String text = tf;
        if (0 == text.length()) {
            JOptionPane.showMessageDialog(null, input + " 不能为空");
            return false;
        }
        return true;
 
    }
    //判断是否为0
    public static boolean checkZero(String tf, String input) {
        if (!checkNumber(tf, input))
            return false;
        String text = tf;
 
        if (0 == Integer.parseInt(text)) {
            JOptionPane.showMessageDialog(null, input + " 不能为零");
            return false;
        }
        return true;
    }
    //判断是否相等
    public static boolean checkEqu(String tf, String input) {
        if (tf.equals(input)) {
            JOptionPane.showMessageDialog(null,  "开始节点与输出节点不能相等");
            return false;
        }
        return true;
 
    }
}
