package basics.datatype;

/**
 * @author Felixovo
 * @create
 * @update 2024-04-21 14:58:10
 * @description 强制类型转换 将取值范围大的类型强制转换成取值范围小的类型
 */
public class CoerceConvert2 {
    public static void main(String[] args) {
        // 强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级。
//        int x = (int)10 * 5.5 + 10 * 4.5; // 错误 double -> int
        int x = (int)(10 * 5.5 + 10 * 4.5); // (int)(100.0) => 100
        System.out.println(x); // 100

        // char类型可以保存int类型的常量值，但不能保存int类型的变量值。
        char c1 = 100;
        int num = 100;
//        char c2 = num; // 错误
        char c3 = (char)num;
        System.out.println(c3); // 'd'
    }
}
