package nova.main;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.skin.OfficeBlue2007Skin;
import org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel;

/**
 * @ClassName:     NovaMain.java
 * @Description:   Startup this application 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午9:56:34 
 */
public class NovaMain {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
        UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
//        try { 
//            UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel()); 
//            //JFrame.setDefaultLookAndFeelDecorated(true); 
//            //JDialog.setDefaultLookAndFeelDecorated(true); 
//            //SubstanceLookAndFeel.setCurrentTheme(new Substance); 
////          SubstanceLookAndFeel.setSkin(new EmeraldDuskSkin()); 
////          SubstanceLookAndFeel.setCurrentButtonShaper(new ClassicButtonShaper()); 
////          SubstanceLookAndFeel.setCurrentWatermark(new SubstanceBubblesWatermark()); 
////          SubstanceLookAndFeel.setCurrentBorderPainter(new StandardBorderPainter()); 
////            SubstanceLookAndFeel.setCurrentGradientPainter(new StandardGradientPainter()); 
////            SubstanceLookAndFeel.setCurrentTitlePainter(new FlatTitePainter()); 
//        } catch (Exception e) { 
//            System.err.println("Something went wrong!"); 
//        } 
        new MyFrame();
    }

}
