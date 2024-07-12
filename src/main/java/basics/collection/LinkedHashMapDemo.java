package basics.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap Demo
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        System.out.println("empty status: " + linkedHashMap.isEmpty());
        // true
        System.out.println("size: " + linkedHashMap.size());
        // 0

        Object putRes = linkedHashMap.put("Amy", "Beijing");
        System.out.println("put res: " + putRes);
        // null

        Object putSameKeyRes = linkedHashMap.put("Amy", "Shanghai");
        System.out.println("put same key res: " + putSameKeyRes);
        // "Beijing"

        linkedHashMap.put("Brown", "Guangzhou");
        linkedHashMap.put("Cindy", "Shenzhen");

        System.out.println("empty status: " + linkedHashMap.isEmpty());
        // false
        System.out.println("size: " + linkedHashMap.size());
        // 3

        System.out.println("contains key `Brown`: " + linkedHashMap.containsKey("Brown"));
        // true
        System.out.println("contains key `Danie`: " + linkedHashMap.containsKey("Danie"));
        // false

        System.out.println("contains value `Guangzhou`: " + linkedHashMap.containsValue("Guangzhou"));
        // true
        System.out.println("contains value `Dongguan`: " + linkedHashMap.containsValue("Dongguan"));
        // false

        Object removeExistentKeyRes = linkedHashMap.remove("Cindy");
        System.out.println("remove existent key res: " + removeExistentKeyRes);
        // "Shenzhen"

        System.out.println("contains key `Cindy`: " + linkedHashMap.containsKey("Cindy"));
        // false

        Object removeNonexistentKeyRes = linkedHashMap.remove("Danie");
        System.out.println("remove nonexistent key res: " + removeNonexistentKeyRes);
        // null

        Object replaceExistentKeyRes = linkedHashMap.replace("Amy", "Chengdu");
        System.out.println("replace existent key res: " + replaceExistentKeyRes);
        // "Shanghai"

        Object replaceNonexistentKeyRes = linkedHashMap.replace("Danie", "Xiamen");
        System.out.println("replace nonexistent key res: " + replaceNonexistentKeyRes);
        // null

        linkedHashMap.clear();
        System.out.println("size: " + linkedHashMap.size());
        // 0
    }
}
