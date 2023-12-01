package basics.collection.map.treemapdemo;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap Demo
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> scoreTreeMap = new TreeMap<>();

        System.out.println("empty after initializing: " + scoreTreeMap.isEmpty());
        // true
        System.out.println("size after initializing: " + scoreTreeMap.size());
        // 0

        Object putRes = scoreTreeMap.put("Amy", 90);
        System.out.println("putRes: " + putRes);
        // null

        Object putSameKeyRes = scoreTreeMap.put("Amy", 96);
        System.out.println("putSameKeyRes: " + putSameKeyRes);
        // 90

        scoreTreeMap.put("Brown", 80);
        scoreTreeMap.put("Cindy", 70);

        System.out.println("empty after putting: " + scoreTreeMap.isEmpty());
        // false
        System.out.println("size after putting: " + scoreTreeMap.size());
        // 3

        System.out.println("contains key `Brown`: " + scoreTreeMap.containsKey("Brown"));
        // true
        System.out.println("contains key `Danie`: " + scoreTreeMap.containsKey("Danie"));
        // false

        System.out.println("contains value `96`: " + scoreTreeMap.containsValue(96));
        // true
        System.out.println("contains value `90`: " + scoreTreeMap.containsValue(90));
        // false

        Object removeExistentKeyRes = scoreTreeMap.remove("Cindy");
        System.out.println("removeExistentKeyRes: " + removeExistentKeyRes);
        // 70

        System.out.println("contains key `Cindy`: " + scoreTreeMap.containsKey("Cindy"));
        // false

        Object removeNonexistentKeyRes = scoreTreeMap.remove("Danie");
        System.out.println("removeNonexistentKeyRes: " + removeNonexistentKeyRes);
        // null

        Object replaceExistentKeyRes = scoreTreeMap.replace("Amy", 100);
        System.out.println("replaceExistentKeyRes: " + replaceExistentKeyRes);
        // 96

        Object replaceNonexistentKeyRes = scoreTreeMap.replace("Danie", 90);
        System.out.println("replaceNonexistentKeyRes: " + replaceNonexistentKeyRes);
        // null

        scoreTreeMap.clear();
        System.out.println("size after clearing: " + scoreTreeMap.size());
        // 0
    }
}
