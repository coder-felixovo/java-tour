package designpattern.creationalpattern;

import designpattern.creationalpattern.factorymethod.BallPointPenFactory;
import designpattern.creationalpattern.factorymethod.MarkerPenFactory;
import designpattern.creationalpattern.factorymethod.PencilFactory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        new BallPointPenFactory().getPen().write();
        new MarkerPenFactory().getPen().write();
        new PencilFactory().getPen().write();
    }
}
