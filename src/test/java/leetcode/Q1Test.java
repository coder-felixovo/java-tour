package leetcode;

import leetcode.Q1;
import org.junit.Test;

import java.util.HashSet;

public class Q1Test {
    @Test
    public void test1() {
        int[] input = new int[]{2, 7, 11, 5};
        int target = 9;
        int[] res = new Q1().twoSum(input, target);
        System.out.println(res[0] + ", " + res[1]); // 0, 1
    }

    @Test
    public void test2() {
        int[] input = new int[]{3, 2, 4};
        int target = 6;
        int[] res = new Q1().twoSum(input, target);
        System.out.println(res[0] + ", " + res[1]); // 1, 2
    }

    @Test
    public void test3() {
        int[] input = new int[]{3, 3};
        int target = 6;
        int[] res = new Q1().twoSum(input, target);
        System.out.println(res[0] + ", " + res[1]); // 0, 1
    }
}
