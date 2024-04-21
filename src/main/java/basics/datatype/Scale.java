package basics.datatype;

/**
 * @author Felixovo
 * @create 2023-05-24 10:43:04
 * @update 2024-04-21 15:00:46
 * @description 进制
 */
public class Scale {
    public static void main(String[] args) {
        int n1 = 123; // 十进制
        int n2 = 0b10; // 二进制
        int n3 = 010; // 八进制
        int n4 = 0xF; // 十六进制

        System.out.println(n1); // 123
        System.out.println(n2); // 2
        System.out.println(n3); // 8
        System.out.println(n4); // 15
    }
}
