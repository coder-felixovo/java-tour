package basics.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet Traverse Demo
 */
public class TreeSetTraverseDemo {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("square");
        treeSet.add("rectangle");
        treeSet.add("triangle");
        treeSet.add("square");

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        System.out.println();
        System.out.println("----------");

        for (String item : treeSet) {
            System.out.print(item + ", ");
        }
    }
}
