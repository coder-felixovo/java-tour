package basics.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 数组->List
 */
public class ArrayToList {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};

        // 1.遍历数组将元素添加到List
        List<Integer> l1 = new ArrayList<>();
        for (int element : arr) {
            l1.add(element);
        }

        // 2.使用Arrays类的asList()方法，其参数需要的是Integer数组
        Integer[] arr1 = new Integer[] {6, 7, 8, 9, 10};
        List<Integer> l2 = Arrays.asList(arr1);
        // 注意，Arrays.asList()方法返回的不是java.util.ArrayList，而是Arrays类的一个内部类
        // 转成java.util.ArrayList
        List<Integer> l3 = new ArrayList<>(Arrays.asList(arr1));

        // 3.流
        List<Integer> l4 = Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
}
