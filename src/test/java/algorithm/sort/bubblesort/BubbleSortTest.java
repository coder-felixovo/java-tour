package algorithm.sort.bubblesort;

import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void test1() {
        int[] arr = {81, 64, 49, 36, 25, 16, 9, 4, 1};
        arr = BubbleSort.solution(arr);
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    /*
        10w：987ms
        100w: 88387ms
     */
    @Test
    public void performanceTest() {
        int capacity = 100000;
        int[] arr = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = (int) Math.random() * capacity * 10;
        }
        long startMs = System.currentTimeMillis();
        BubbleSort.solution(arr);
        long endMs = System.currentTimeMillis();
        long consumption = endMs - startMs;
        System.out.println("It spent " + consumption + "ms");
    }

}
