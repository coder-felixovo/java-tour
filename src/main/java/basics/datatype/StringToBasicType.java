package basics.datatype;

/**
 * @author Felixovo
 * @create 2023-05-24 10:36:36
 * @update 2024-04-21 15:01:19
 * @description String类型转换为基本数据类型
 */
public class StringToBasicType {
    public static void main(String[] args) {
        String str = "123";
//        int num = (int)str; // 报错

        // 需要借助包装类的方法才能转换
        byte b = Byte.parseByte("100");
        short s = Short.parseShort("101");
        int i = Integer.parseInt("102");
        long l = Long.parseLong(("103"));
        float f = Float.parseFloat("3.1415926");
        double d = Double.parseDouble("2.7182818");
        boolean flag = Boolean.parseBoolean("true");

        // 要确保String类型能够转成有效数据，如果格式不正确就会抛出异常
        int n1 = Integer.parseInt("123");
        int n2 = Integer.parseInt("hello"); // 运行时抛出异常NumberFormatException
    }
}
