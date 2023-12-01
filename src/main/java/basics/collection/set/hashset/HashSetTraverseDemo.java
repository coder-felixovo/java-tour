package basics.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet Traverse Demo
 */
public class HashSetTraverseDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("coconut");
        hashSet.add("apple");

        /* */
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        System.out.println();
        System.out.println("----------");

        /* */
        for (String item : hashSet) {
            System.out.print(item + ", ");
        }
    }
}
