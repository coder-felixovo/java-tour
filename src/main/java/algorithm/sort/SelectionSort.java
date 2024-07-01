package algorithm.sort;

/**
 * Selection Sort
 * Best: O(n^2)
 * Worst: O(n^2)
 * Avg: O(n^2)
 * Space: O(1)
 * In-place, unstable
 */
public class SelectionSort {
    public static int[] solution(int[] arr) {
        int len = arr.length;
        int minIndex, temp;
        for (int i = 0; i < len; i++) {
            // Treats the first element of an array as the smallest.
            minIndex = i;
            // Find the minimum element index.
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
