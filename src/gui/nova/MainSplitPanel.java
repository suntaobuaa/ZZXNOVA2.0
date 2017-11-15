/**
 * 
 */
package gui.nova;

import javax.swing.JSplitPane;

/**
 * @ClassName:     MainSplitPanel.java
 * @Description:   MainSplitPanel 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 下午12:37:04 
 */
public class MainSplitPanel extends JSplitPane{
    private JSplitPane right = null;
    private MainPanel mp = null;
    private SouthPanel sp = null;
    private WestPanel wp = null;
    public MainSplitPanel(int newOrientation) {
        // TODO Auto-generated constructor stub
        super(newOrientation);
        //
        wp = new WestPanel();
        mp = new MainPanel();
        sp = new SouthPanel();
        right = new JSplitPane(JSplitPane.VERTICAL_SPLIT,mp,sp);
        right.setDividerLocation(500);
        //
        this.setRightComponent(right);
        this.setLeftComponent(wp);
        this.setDividerLocation(100);
    }
    public JSplitPane getRight() {
        return right;
    }
    public void setRight(JSplitPane right) {
        this.right = right;
    }
    public MainPanel getMp() {
        return mp;
    }
    public void setMp(MainPanel mp) {
        this.mp = mp;
    }
    public SouthPanel getSp() {
        return sp;
    }
    public void setSp(SouthPanel sp) {
        this.sp = sp;
    }

}
