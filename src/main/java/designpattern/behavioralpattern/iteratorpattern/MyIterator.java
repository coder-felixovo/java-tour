package designpattern.behavioralpattern.iteratorpattern;

import java.util.List;

/**
 * Concrete Iterator
 */
public class MyIterator implements Iterator {
    private List<Object> list;
    private int index = 0;

    public MyIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object previous() {
        if ((this.index - 1) < 0) {
            return null;
        } else {
            return this.list.get(--index);
        }
    }

    @Override
    public Object next() {
        if ((this.index + 1) >= this.list.size()) {
            return null;
        } else {
            return this.list.get(++index);
        }
    }

    @Override
    public boolean hasNext() {
        if (this.index < (this.list.size() - 1)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object first() {
        if (this.list.size() <= 0) {
            return null;
        } else {
            return this.list.get(0);
        }
    }
}
