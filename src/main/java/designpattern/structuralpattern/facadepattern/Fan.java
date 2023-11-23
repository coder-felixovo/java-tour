package designpattern.structuralpattern.facadepattern;

/**
 * Sub System
 */
public class Fan {
    private String position;

    public Fan(String position) {
        this.position = position;
    }

    public void on() {
        System.out.println(this.position + "风扇打开！");
    }

    public void off() {
        System.out.println(this.position + "风扇关闭！");
    }
}
