package basics.datatype;

/**
 * @author Felixovo
 * @create
 * @update 2024-04-21 14:27:00
 * @description 自动类型提升 将取值范围小的类型自动提升为取值范围大的类型
 */
public class AutoConvert1 {
    public static void main(String[] args) {
        // 将存储范围小的值赋值给了存储范围大的变量
        int i = 'a'; // char -> int 将字符的编码值赋值给了 i 变量
        double d = 80; // int -> double
        System.out.println(i); // 97
        System.out.println(d); // 80.0
    }
}
