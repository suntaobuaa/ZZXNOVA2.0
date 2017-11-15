package util.nova;

import java.util.Map;

import javax.swing.JLabel;

import org.jgraph.graph.GraphConstants;

/**
 * @ClassName:     MyGraphConstants.java
 * @Description:   Extends GraphConstants to set some value for cell 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年11月15日 上午9:53:07 
 */
public class MyGraphConstants extends GraphConstants{
    public final static String name = "name";
    public static final void setName(Map map, String cellname) {
        map.put(name, cellname);
}

/**
 * Returns the horizontalalignment attribute from the specified map.
 */
public static final Object getName(Map map) {
        String s  = (String) map.get(name);
        if (s != null)
                return s;
        return JLabel.CENTER;
}

}
