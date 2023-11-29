package designpattern.behavioralpattern.statepattern;

import org.junit.Test;

public class StatePatternTest {
    @Test
    public void client1() {
        Logistics logistics = new Logistics();

        OrderState orderState = new OrderState();
        logistics.setLogisticsState(orderState);
        logistics.doAction();

        ProductOutState productOutState = new ProductOutState();
        logistics.setLogisticsState(productOutState);
        logistics.doAction();
    }
}
