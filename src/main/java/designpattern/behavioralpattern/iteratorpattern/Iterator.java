package designpattern.behavioralpattern.iteratorpattern;

/**
 * Iterator
 */
public interface Iterator {
    Object first();
    Object previous();
    Object next();
    boolean hasNext();
}
