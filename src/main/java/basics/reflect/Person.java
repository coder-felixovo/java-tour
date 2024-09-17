package basics.reflect;

public class Person {
    public String name;
    protected int age;
    private boolean isVip;
    char sex;

    public Person() {
        System.out.println("Person类，public无参构造方法");
    }

    public Person(String name, int age, boolean isVip) {
        System.out.println("Person类，public全参构造方法");
        this.name = name;
        this.age = age;
        this.isVip = isVip;
    }

    Person(boolean isVip) {
        System.out.println("Person类，默认构造方法，接收参数：isVip");
    }

    protected Person(String name) {
        System.out.println("Person类，protected构造方法，接收参数：name");
    }

    private Person(int age) {
        System.out.println("Person类，private构造方法，接收参数：age");
    }

    public static void output1() {
        System.out.println("调用了public static void output1()方法");
    }

    public void print1() {
        System.out.println("调用了public void print1()方法");
    }

    protected void print2() {
        System.out.println("调用了protected void print2()方法");
    }

    void print3() {
        System.out.println("调用了void print3()方法");
    }

    private void print4() {
        System.out.println("调用了private void print4()方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isVip=" + isVip +
                '}';
    }
}
