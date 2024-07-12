package basics.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap Traverse Demo
 */
public class TreeMapTraverseDemo {
    public static void main(String[] args) {
        Map<String, Integer> scoreTreeMap = new TreeMap<>();

        scoreTreeMap.put("Amy", 95);
        scoreTreeMap.put("Brown", 85);
        scoreTreeMap.put("Cindy", 75);

        /* */
        for (Map.Entry<String, Integer> entry : scoreTreeMap.entrySet()) {
            System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
        }
        /*
            key=Amy, value=95
            key=Brown, value=85
            key=Cindy, value=75
         */

        System.out.println("----------");

        /* */
        for (String key : scoreTreeMap.keySet()) {
            System.out.println("key=" + key);
        }
        /*
            key=Amy
            key=Brown
            key=Cindy
         */
        for (Integer value : scoreTreeMap.values()) {
            System.out.println("value=" + value);
        }
        /*
            value=95
            value=85
            value=75
         */

        System.out.println("----------");

        /* */
        Iterator<Map.Entry<String, Integer>> entryIterator = scoreTreeMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
        }
        /*
            key=Amy, value=95
            key=Brown, value=85
            key=Cindy, value=75
         */

        System.out.println("----------");

        /* */
        scoreTreeMap.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
        /*
            key=Amy, value=95
            key=Brown, value=85
            key=Cindy, value=75
         */
    }
}
