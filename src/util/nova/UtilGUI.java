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
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��11��15�� ����6:53:55 
 * @Place          �������պ����ѧ�е���������о���
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
    //����Ƿ�����
    public static boolean checkNumber(String tf, String input) {
        if (!checkEmpty(tf, input))
            return false;
        String text = tf;
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, input + " ��Ҫ������");
            return false;
        }
    }
    //�ж��Ƿ��
    public static boolean checkEmpty(String tf, String input) {
        String text = tf;
        if (0 == text.length()) {
            JOptionPane.showMessageDialog(null, input + " ����Ϊ��");
            return false;
        }
        return true;
 
    }
    //�ж��Ƿ�Ϊ0
    public static boolean checkZero(String tf, String input) {
        if (!checkNumber(tf, input))
            return false;
        String text = tf;
 
        if (0 == Integer.parseInt(text)) {
            JOptionPane.showMessageDialog(null, input + " ����Ϊ��");
            return false;
        }
        return true;
    }
    //�ж��Ƿ����
    public static boolean checkEqu(String tf, String input) {
        if (tf.equals(input)) {
            JOptionPane.showMessageDialog(null,  "��ʼ�ڵ�������ڵ㲻�����");
            return false;
        }
        return true;
 
    }
}
