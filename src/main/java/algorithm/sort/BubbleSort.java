package algorithm.sort;

/**
 * Bubble Sort
 * Best: O(n)
 * Worst: O(n^2)
 * Avg: O(n^2)
 * Space: O(1)
 */
public class BubbleSort {
    public static int[] solution(int[] arr) {
        int len = arr.length;
        // 外层循环控制比较轮数
        for (int i = 0; i < len - 1; i++) {
            // 内层循环控制比较次数
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
