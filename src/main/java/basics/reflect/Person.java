package basics.reflect;

public class Person {
    private String name;
    private int age;
    private boolean isVip;

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
