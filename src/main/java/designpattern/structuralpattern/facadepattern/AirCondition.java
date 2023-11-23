package designpattern.structuralpattern.facadepattern;

/**
 * Sub System
 */
public class AirCondition {
    private String position;

    public AirCondition(String position) {
        this.position = position;
    }

    public void on() {
        System.out.println(this.position + "空调打开");
    }

    public void off() {
        System.out.println(this.position + "空调关闭！");
    }
}
