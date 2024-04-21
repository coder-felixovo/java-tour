package basics.datatype;

/**
 * @author Felixovo
 * @create
 * @update 2024-04-21 15:02:15
 * @description 使用float和double类型值
 */
public class UseFloatAndDouble {
    public static void main(String[] args) {
        double num1 = 2.7;
        double num2 = 2.7;
        double num3 = 8.1 / 3;
        System.out.println(num1 == num2); // true
        System.out.println(num1 == num3); // false
        double num4 = 1.0;
        double num5 = 2.0 / 2;
        double num6 = 2 / 2.0;
        System.out.println(num4 == num5); // true
        System.out.println(num4 == num6); // true
        System.out.println(num5 == num6); // true
        /* 精度 */
        float num7 = 3.141592653589f;
        double num8 = 3.141592653589;
        System.out.println(num7); // 3.1415927
        System.out.println(num8); // 3.141592653589
    }
}
