package basics.datatype;

/**
 * @author Felixovo
 * @create
 * @update 2024-04-21 14:48:00
 * @description 自动类型提升 将取值范围小的类型自动提升为取值范围大的类型
 */
public class AutoConvert2 {
    public static void main(String[] args) {
        // 有多种数据类型混合运算时 自动将所有数据转换成容量最大的那种数据类型再进行计算
        int a1 = 10;
//        float a2 = a1 + 3.14; // 报错，小数3.14类型为double
        double a3 = a1 + 3.14;
        float a4 = a1 + 3.14F;

        // 将精度大的数据类型赋值给精度小的数据类型，报错。
//        int b1 = 2.71; // 报错 double -> int

        // byte, short和char之间不会相互转换
//        char c1 = b1; // 报错

        // 当把一个数赋值给byte时，先判断该数是否在byte范围内，是就可以赋值。
        // byte的范围 -128 ~ 127
        byte d1 = 10; // 正确
//        byte d2 = 128; // 错误
        // 注意下面两行
        int d3 = 10;
//        byte d4 = d3; // 错误，这里是变量赋值，需要判断类型

//        byte、short、char三者之间可以进行运算，先转换为int类型。
        byte e1 = 1;
        short e2 = 2;
        char e3 = 'a';
        int e4 = e1 + e2 + e3;
        System.out.println(e4); // 100

//        表达式的结果自动提升为操作数中最大的数据类型。
    }
}
