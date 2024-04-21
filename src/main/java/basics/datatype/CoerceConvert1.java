package basics.datatype;

/**
 * @author Felixovo
 * @create
 * @update 2024-04-21 14:56:29
 * @description 强制类型转换 将取值范围大的类型强制转换成取值范围小的类型
 */
public class CoerceConvert1 {
    public static void main(String[] args) {
//        int i = 3.14; // 报错

        int n1 = (int)3.14;
        System.out.println(n1); // 3 造成精度损失

        int n2 = 129;
        byte b1 = (byte)n2;
        System.out.println(b1); // -127 造成数据溢出
    }
}
