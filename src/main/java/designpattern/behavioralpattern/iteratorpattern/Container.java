package designpattern.behavioralpattern.iteratorpattern;

/**
 * Container
 */
public abstract class Container {
    public abstract Iterator iterator();
    public abstract void put(Object obj);
}
