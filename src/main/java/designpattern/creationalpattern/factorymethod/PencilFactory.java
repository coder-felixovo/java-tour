package designpattern.creationalpattern.factorymethod;

import designpattern.creationalpattern.simplefactory.Pen;
import designpattern.creationalpattern.simplefactory.Pencil;

/**
 * 具体工厂角色
 */
public class PencilFactory implements Factory{
    @Override
    public Pen getPen() {
        return new Pencil();
    }
}
