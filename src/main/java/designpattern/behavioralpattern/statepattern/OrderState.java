package designpattern.behavioralpattern.statepattern;

public class OrderState implements LogisticsState {
    @Override
    public void doAction(Logistics context) {
        System.out.println("The merchant has received the order and is processing it...");
    }
}
