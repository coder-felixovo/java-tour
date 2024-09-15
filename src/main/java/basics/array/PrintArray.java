package basics.array;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 打印数组
 */
public class PrintArray {
    public static void main(String[] args) {
        // 直接打印数组变量
        String[] strArr = new String[] {"apple", "banana", "coconut"};
        System.out.println(strArr);
        // [Ljava.lang.String;@6e0be858
        // [Ljava.lang.String;表示字符串数组的Class名称
        // @6e0be858 是十六进制的hashcode

        System.out.println();

        // for循环打印数组
        int len = strArr.length;
        for (int i = 0; i < len; i++) {
            System.out.println(strArr[i]);
        }

        System.out.println();

        // stream流打印数组
        // 1.
        Arrays.asList(strArr).stream().forEach(str -> System.out.println(str));
        // 2.
        Stream.of(strArr).forEach(System.out::println);
        // 3.
        Arrays.stream(strArr).forEach(System.out::println);

        System.out.println();

        // Arrays工具类打印数组
        System.out.println(Arrays.toString((strArr)));
        // [apple, banana, coconut]
    }
}
