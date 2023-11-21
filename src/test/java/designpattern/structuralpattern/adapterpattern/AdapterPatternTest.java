package designpattern.structuralpattern.adapterpattern;

import designpattern.structuralpattern.adapterpattern.classadapterimpl.Adapter;
import designpattern.structuralpattern.adapterpattern.classadapterimpl.AdapterTarget;
import designpattern.structuralpattern.adapterpattern.objectadapterimpl.ObjectAdapterPattern;
import org.junit.Test;

public class AdapterPatternTest {

    @Test
    public void classAdapterTest() {
        AdapterTarget newPlug = new Adapter();
        newPlug.doubleHoleSocket();
    }

    @Test
    public void objectAdapterTest() {
        ObjectAdapterPattern adapter = new ObjectAdapterPattern();
        adapter.doubleHoleSocket();
    }

}
