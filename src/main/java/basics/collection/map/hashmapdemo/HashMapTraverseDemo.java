package basics.collection.map.hashmapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HashMap Traverse Demo
 */
public class HashMapTraverseDemo {
    public static void main(String[] args) {
        Map<String, Integer> scoreHashMap = new HashMap<>();

        scoreHashMap.put("Amy", 90);
        scoreHashMap.put("Brown", 80);
        scoreHashMap.put("Cindy", 70);

        /* */
        for (Map.Entry<String, Integer> entry : scoreHashMap.entrySet()) {
            System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
        }

        System.out.println("----------");

        /* */
        for (String key : scoreHashMap.keySet()) {
            System.out.println("key=" + key);
        }

        for (Integer value : scoreHashMap.values()) {
            System.out.println("value=" + value);
        }

        System.out.println("----------");

        /* */
        Iterator<Map.Entry<String, Integer>> entryIterator = scoreHashMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
        }

        System.out.println("----------");

        /* */
        scoreHashMap.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
    }
}
