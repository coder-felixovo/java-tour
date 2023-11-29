package designpattern.behavioralpattern.mediatorpattern;

/**
 * 具体同事类 Concrete Colleague
 */
public class ConcreteColleagueTwo extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2接收请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发送请求");
        mediator.relay(this);
    }
}
