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

    public static int[] solution2(int[] arr) {
        int len = arr.length;
        boolean flag = false; // 标记当前轮次是否交换元素
        // 外层循环控制比较轮数
        for (int i = 0; i < len - 1; i++) {
            // 内层循环控制比较次数
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    // 交换元素，置为true
                    flag = true;
                }
            }

            // 完成一轮排序
            if (!flag) {
                // 如果元素未发生交换，说明数组已经有序，结束排序
                break;
            } else {
                // 交换元素，flag重新置为false，以便记录下一次排序是否发生元素交换
                flag = false;
            }
        }
        return arr;
    }
}
