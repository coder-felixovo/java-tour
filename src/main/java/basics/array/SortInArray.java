package basics.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 数组的排序
 */
public class SortInArray {
    public static void main(String[] args) {
        // Arrays类提供了sort()方法

        // 1.基本数据类型升序排序
        int[] intArr = new int[] {5, 4, 3, 2, 1};
        Arrays.sort(intArr);
        for (int element : intArr) {
            System.out.println(element);
        }
        // 1 2 3 4 5

        // 2.实现Comparable接口的对象按照compareTo()方法排序
        String[] strArr = new String[] {"A", "B", "C", "D", "E"};
        Arrays.sort(strArr, 1, 4, Comparator.comparing(String::toString).reversed());
        for (String element : strArr) {
            System.out.println(element);
        }
        // A D C B E
    }
}
