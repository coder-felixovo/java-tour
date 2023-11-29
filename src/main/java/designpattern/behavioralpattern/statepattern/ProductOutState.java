package designpattern.behavioralpattern.statepattern;

public class ProductOutState implements LogisticsState{
    @Override
    public void doAction(Logistics context) {
        System.out.println("The goods are out of stock...");
    }
}
