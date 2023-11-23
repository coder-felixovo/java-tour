package designpattern.structuralpattern.facadepattern;

public class GeneralSwitchFacade {
    private Light light;
    private Fan fan;
    private AirCondition ac;

    public GeneralSwitchFacade() {
        light = new Light("左前");
        fan = new Fan("中间");
        ac = new AirCondition("后方");
    }

    public void on() {
        light.on();
        fan.on();
        ac.on();
    }

    public void off() {
        light.off();
        fan.off();
        ac.off();
    }
}
