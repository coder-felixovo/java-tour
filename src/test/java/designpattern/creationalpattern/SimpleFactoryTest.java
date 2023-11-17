package designpattern.creationalpattern;

import designpattern.creationalpattern.simplefactory.Pen;
import designpattern.creationalpattern.simplefactory.SimpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Pen ballPointPen = SimpleFactory.getPen("BallPointPen");
        ballPointPen.write();

        Pen markerPen = SimpleFactory.getPen("MarkerPen");
        markerPen.write();

        Pen pencil = SimpleFactory.getPen("Pencil");
        pencil.write();

        System.out.println("----------");

        Pen pencil1 = SimpleFactory.getPenTwo("Pencil");
        pencil1.write();

        Pen markerPen2 = SimpleFactory.getPenTwo("MarkerPen");
        markerPen2.write();

        Pen ballPointPen2 = SimpleFactory.getPenTwo("BallPointPen");
        ballPointPen2.write();
    }
}
