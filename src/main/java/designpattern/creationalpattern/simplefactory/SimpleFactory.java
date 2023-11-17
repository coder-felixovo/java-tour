package designpattern.creationalpattern.simplefactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂
 */
public class SimpleFactory {
    public static Pen getPen(String type) {
        switch (type) {
            case "BallPointPen": return new BallPointPen();
            case "MarkerPen": return new MarkerPen();
            case "Pencil": return new Pencil();
            default:break;
        }
        return new Pencil();
    }

    private static final Map<String, Pen> PEN_MAP = new HashMap<>();

    static {
        PEN_MAP.put("BallPointPen", new BallPointPen());
        PEN_MAP.put("MarkerPen", new MarkerPen());
        PEN_MAP.put("Pencil", new Pencil());
    }

    public static Pen getPenTwo(String type) {
        return PEN_MAP.get(type);
    }
}
