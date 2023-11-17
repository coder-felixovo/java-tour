package designpattern.creationalpattern.factorymethod;

import designpattern.creationalpattern.simplefactory.Pen;

/**
 * 抽象工厂角色
 */
public interface Factory {
    Pen getPen();
}
