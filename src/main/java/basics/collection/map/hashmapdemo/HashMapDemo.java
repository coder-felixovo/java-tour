package basics.collection.map.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap Demo
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> scoreHashMap = new HashMap<>();

        System.out.println("empty after initializing: " + scoreHashMap.isEmpty());
        // true
        System.out.println("size after initializing: " + scoreHashMap.size());
        // 0

        Object putRes = scoreHashMap.put("Amy", 90);
        System.out.println("putRes: " + putRes);
        // null

        Object putSameKeyRes = scoreHashMap.put("Amy", 96);
        System.out.println("putSameKeyRes: " + putSameKeyRes);
        // 90

        scoreHashMap.put("Brown", 80);
        scoreHashMap.put("Cindy", 70);

        System.out.println("empty after putting: " + scoreHashMap.isEmpty());
        // false
        System.out.println("size after putting: " + scoreHashMap.size());
        // 3

        System.out.println("contains key `Brown`: " + scoreHashMap.containsKey("Brown"));;
        // true
        System.out.println("contains key `Danie`: " + scoreHashMap.containsKey("Danie"));;
        // false

        Object removeExistentKeyRes = scoreHashMap.remove("Cindy");
        System.out.println("removeExistentKeyRes: " + removeExistentKeyRes);
        // 70

        System.out.println("contains key `Cindy`: " + scoreHashMap.containsKey("Cindy"));
        // false

        Object removeNonexistentKeyRes = scoreHashMap.remove("Danie");
        System.out.println("removeNonexistentKeyRes: " + removeNonexistentKeyRes);
        // null

        Object replaceExistentKeyRes = scoreHashMap.replace("Amy", 90);
        System.out.println("replaceExistentKeyRes: " + replaceExistentKeyRes);
        // 96

        Object replaceNonexistentKeyRes = scoreHashMap.replace("Danie", 90);
        System.out.println("replaceNonexistentKeyRes: " + replaceNonexistentKeyRes);
        // null

        scoreHashMap.clear();
        System.out.println("size after clearing: " + scoreHashMap.size());
        // 0
    }
}
