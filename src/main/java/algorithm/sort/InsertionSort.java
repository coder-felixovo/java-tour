package algorithm.sort;

/**
 * Insertion Sort
 * Best: O(n)
 * Worst: O(n^2)
 * Avg: O(n^2)
 * Space: O(1)
 * In-place, Stable
 * 基本思想：将n个待排序的元素看成一个有序表和一个无序表，一开始有序表只包含一个元素，无序表包含 n-1 个元素。
 *         每次从无序表中取出第一个元素，依次与有序表中的元素比较，将它插入到有序表中的适当位置，使之成为新的有序表。
 */
public class InsertionSort {
    public static int[] solution(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int cur = arr[i]; // 待插入元素
            int preIndex = i - 1;
            // preIndex >= 0 防止数组越界
            while(preIndex >= 0 && arr[preIndex] > cur) {
                arr[preIndex + 1] = arr[preIndex]; // 大的元素后移
                preIndex--; // 有序表倒序往前搜索
            }
            // 退出while循环表示找到插入的位置
            arr[preIndex + 1] = cur;
        }
        return arr;
    }
}