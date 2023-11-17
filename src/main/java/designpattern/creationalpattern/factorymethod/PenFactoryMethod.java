package designpattern.creationalpattern.factorymethod;

public class PenFactoryMethod {
    public static void main(String[] args) {
        new BallPointPenFactory().getPen().write();
        new MarkerPenFactory().getPen().write();
        new PencilFactory().getPen().write();
    }
}
