package designpattern.creationalpattern.factorymethod;

import designpattern.creationalpattern.simplefactory.BallPointPen;
import designpattern.creationalpattern.simplefactory.Pen;

/**
 * 具体工厂角色
 */
public class BallPointPenFactory implements Factory{
    @Override
    public Pen getPen() {
        return new BallPointPen();
    }
}
