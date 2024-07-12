package basics.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet Demo
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        System.out.println("empty: " + hashSet.isEmpty());
        // true
        System.out.println("size: " + hashSet.size());
        // 0

        Object setAddRes = hashSet.add("Amy");
        System.out.println("set add res: " + setAddRes);
        // true

        Object setAddSameElement = hashSet.add("Amy");
        System.out.println("set add same element res: " + setAddSameElement);
        // false

        hashSet.add("Brown");
        hashSet.add("Cindy");

        System.out.println("empty: " + hashSet.isEmpty());
        // false
        System.out.println("size: " + hashSet.size());
        // 3

        Object containExistentElementRes = hashSet.contains("Amy");
        System.out.println("contains existent element res: " + containExistentElementRes);
        // true

        Object containNonexistentElementRes = hashSet.contains("Danie");
        System.out.println("contains nonexistent element res: " + containNonexistentElementRes);
        // false

        Object removeExistentElementRes = hashSet.remove("Cindy");
        System.out.println("remove existent element res: " + removeExistentElementRes);
        // true

        System.out.println("contains `Cindy` element: " + hashSet.contains("Cindy"));
        // false

        Object removeNonexistentElementRes = hashSet.remove("Danie");
        System.out.println("remove nonexistent element res: " + removeNonexistentElementRes);
        // false

        hashSet.clear();
    }
}
