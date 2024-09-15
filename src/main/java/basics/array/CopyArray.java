package basics.array;

import java.util.Arrays;

/**
 * 复制数组
 */
public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3};
        int[] arr2 = new int[] {4, 5, 6};
        int[] mergedArr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0 ,mergedArr, 0, arr1.length);
        System.out.println(Arrays.toString(mergedArr));
        // [1, 2, 3, 0, 0, 0]

        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        System.out.println(Arrays.toString(mergedArr));
        // [1, 2, 3, 4, 5, 6
    }
}
