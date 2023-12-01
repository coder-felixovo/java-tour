package basics.collection.map.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap Traverse Demo
 */
public class LinkedHashMapTraverseDemo {
    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Amy", "Beijing");
        linkedHashMap.put("Brown", "Shanghai");
        linkedHashMap.put("Cindy", "Guangzhou");

        /* */
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
        }

        System.out.println("----------");

        /* */
        for (String key : linkedHashMap.keySet()) {
            System.out.println("key=" + key);
        }

        for (String value : linkedHashMap.values()) {
            System.out.println("value=" + value);
        }

        System.out.println("----------");

        /* */
        Iterator<Map.Entry<String, String>> entryIterator = linkedHashMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.println("key=" + entry.getKey() + ", value" + entry.getValue());
        }

        System.out.println("----------");

        /* */
        linkedHashMap.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
    }
}
