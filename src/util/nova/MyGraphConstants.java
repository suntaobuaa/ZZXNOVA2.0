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
public class MyGraphConstants extends GraphConstants {
    //cell's name 
    public final static String name = "name";
    //edge's partent
    public final static String partent = "partent";
    //edge's child
    public final static String child = "child";
    //Commands
    public final static String Commands = "commands";
    //get and set name 
    public static final void setName(Map map, String cellname) {
        map.put(name, cellname);
    }

    /**
     * Returns the horizontalalignment attribute from the specified map.
     */
    public static final Object getName(Map map) {
        String s = (String) map.get(name);
        if (s != null)
            return s;
        return JLabel.CENTER;
    }
    //get and set partent's name
    public static final void setPartent(Map map, String partentname) {
        map.put(partent, partentname);
    }
    public static final Object gePartent(Map map) {
        String s = (String) map.get(partent);
        if (s != null)
            return s;
        return JLabel.CENTER;
    }
  //get and set child's name
    public static final void setChild(Map map, String childname) {
        map.put(child, childname);
    }
    public static final Object getChild(Map map) {
        String s = (String) map.get(child);
        if (s != null)
            return s;
        return JLabel.CENTER;
    }
    //get and set Commands
    public static final void setCommands(Map map, String inputCommands) {
        map.put(Commands, inputCommands);
    }
    public static final Object getCommands(Map map) {
        String s = (String) map.get(Commands);
        if (s != null)
            return s;
        return "";
    }
}
