package algorithm.sort;

/**
 * Insertion Sort
 * Best: O(n)
 * Worst: O(n^2)
 * Avg: O(n^2)
 * Space: O(1)
 * In-place, Stable
 */
public class InsertionSort {
    public static int[] solution(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int cur = arr[i];
            int preIndex = i - 1;
            while(preIndex >= 0 && arr[preIndex] > cur) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = cur;
        }
        return arr;
    }
}