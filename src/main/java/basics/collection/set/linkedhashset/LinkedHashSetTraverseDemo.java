package basics.collection.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * LinkedHashSet Traverse Demo
 */
public class LinkedHashSetTraverseDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("panda");
        linkedHashSet.add("lion");
        linkedHashSet.add("tiger");
        linkedHashSet.add("panda");

        /* 从结果可以看出，LinkedHashSet遍历元素的顺序与添加元素时的顺序一致 */
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        System.out.println();
        System.out.println("----------");

        /* */
        for (String item : linkedHashSet) {
            System.out.print(item + ", ");
        }
    }
}
