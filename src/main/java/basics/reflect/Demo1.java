package basics.reflect;

/**
 * 获取Class实例的方式
 */
public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. 创建目标类实例，调用实例的getClass()方法
        Person person = new Person();
        Class personClass = person.getClass();

        // 2. 访问目标类的class属性
        Class personClass2 = Person.class;

        System.out.println(personClass == personClass2); // true

        // 3. Class.forName()方法
        Class personClass3 = Class.forName("basics.reflect.Person"); // 字符串的值必须是带包名的类路径
        System.out.println(personClass == personClass3); // true
    }
}
