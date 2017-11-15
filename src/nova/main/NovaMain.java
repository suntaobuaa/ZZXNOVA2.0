package nova.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @ClassName:     NovaMain.java
 * @Description:   Startup this application 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��11��15�� ����9:56:34 
 */
public class NovaMain {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        MyFrame nova = new MyFrame();
    }

}
