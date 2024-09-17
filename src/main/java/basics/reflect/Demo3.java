package basics.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取Class实例
        Class personClass = Class.forName("basics.reflect.Person");

        // 1. 获取所有public字段
        System.out.println("**********获取所有public字段**********");
        Field[] fields = personClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println();

        // 2. 获取所有字段
        System.out.println("**********获取所有字段**********");
        Field[] fields1 = personClass.getDeclaredFields();
        for (Field f : fields1) {
            System.out.println(f);
        }

        System.out.println();

        // 3. 获取单个public字段
        System.out.println("**********获取单个public字段**********");
        Field f = personClass.getField("name");
        System.out.println(f);
        // 创建实例
        Object obj = personClass.getConstructor().newInstance();
        // 为字段设置值
        f.set(obj, "张三");
        // 验证
        Person p = (Person) obj;
        System.out.println(p.toString());

        System.out.println();

        // 4. 获取单个字段
        System.out.println("**********获取单个字段**********");
        Field f1 = personClass.getDeclaredField("isVip");
        System.out.println(f1);
        // 设置允许访问
        f1.setAccessible(true);
        // 为字段设置属性值
        f1.set(obj, true);
        // 验证
        System.out.println(obj.toString());
    }
}
