package designpattern.behavioralpattern.mediatorpattern;

/**
 * 具体同事类 Concrete Colleague
 */
public class ConcreteColleagueOne extends Colleague{
    @Override
    public void receive() {
        System.out.println("具体同事类1接收请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发送请求");
        mediator.relay(this); // 中介者转发
    }
}
