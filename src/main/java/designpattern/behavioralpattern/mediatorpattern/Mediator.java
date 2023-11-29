package designpattern.behavioralpattern.mediatorpattern;

/**
 * 抽象中介者 Mediator
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl);
}
