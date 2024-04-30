package algorithm.sort;

import algorithm.sort.SelectionSort;
import org.junit.Test;

public class SelectionSortTest {
    @Test
    public void test1() {
        int[] arr = {81, 64, 49, 36, 25, 16, 9, 4, 1};
        arr = SelectionSort.solution(arr);
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    /*
        10w: 734ms, 800ms, 761ms
        100w: 69100ms, 69955ms, 71369ms
     */
    @Test
    public void performanceTest() {
        int capacity = 1000000;
        int[] arr = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = (int) Math.random() * capacity * 10;
        }
        long startMs = System.currentTimeMillis();
        SelectionSort.solution(arr);
        long endMs = System.currentTimeMillis();
        long consumption = endMs - startMs;
        System.out.println("It spent " + consumption + "ms");
    }
}
