package designpattern.behavioralpattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class MyContainer extends Container {
    private List<Object> list;

    public MyContainer() {
        this.list = new ArrayList<>();
    }

    @Override
    public void put(Object obj) {
        this.list.add(obj);
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(list);
    }
}
