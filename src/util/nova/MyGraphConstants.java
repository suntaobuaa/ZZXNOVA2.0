package util.nova;

import java.util.Map;

import javax.swing.JLabel;

import org.jgraph.graph.GraphConstants;

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
