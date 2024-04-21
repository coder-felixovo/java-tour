package basics.datatype;

/**
 * @author Felixovo
 * @create
 * @update 2024-04-21 15:02:37
 * @description 使用char类型值
 */
public class UseChar {
    public static void main(String[] args) {
        // 字符常量使用单引号''括起来的单个字符。
        char c1 = 'a';
        char c2 = 65; // 可以赋一个整数
        char c3 = '\n'; // 表示换行
        System.out.println(c1); // 'a'
        System.out.println((int)c1); // 97, 输出字符'a'对应的数字
        System.out.println(c3);
        System.out.println(c2); // 'A', 输出65表示的unicode字符
        System.out.println(c1 + c2); // 162, 能够进行运算
    }
}
