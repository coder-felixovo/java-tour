package basics.reflect;

public class    TargetObject {
    private String value;

    public TargetObject() {}

    public TargetObject(String value) {
        this.value = value;
    }

    public void publicMethod(String s) {
        System.out.println("I like " + s);
    }

    public void privateMethod() {
        System.out.println("value is " + this.value);
    }
}
