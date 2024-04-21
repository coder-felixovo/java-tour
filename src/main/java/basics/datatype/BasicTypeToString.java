package basics.datatype;

/**
 * @author Felixovo
 * @create
 * @update 2024-4-21 14:51:00
 * @description 基本数据类型与String的运算
 */
public class BasicTypeToString {
    public static void main(String[] args) {
        // 任意八种基本数据类型与String类型只能进行连接"+"运算, 且结果一定也是String类型
        int n = 100;
        float f = 3.14f;
        double e = 2.71;
        boolean flag = true;
        String str1 = n + "";
        String str2 = f + "";
        String str3 = e + "";
        String str4 = flag + "";
        System.out.println(str1 + str2 + str3 + str4); // "1003.142.71true"
    }
}
