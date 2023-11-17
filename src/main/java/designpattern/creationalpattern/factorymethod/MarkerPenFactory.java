package designpattern.creationalpattern.factorymethod;

import designpattern.creationalpattern.simplefactory.MarkerPen;
import designpattern.creationalpattern.simplefactory.Pen;

/**
 * 具体工厂角色
 */
public class MarkerPenFactory implements Factory{
    @Override
    public Pen getPen() {
        return new MarkerPen();
    }
}
