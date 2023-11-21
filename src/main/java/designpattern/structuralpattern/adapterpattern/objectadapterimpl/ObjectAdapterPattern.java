package designpattern.structuralpattern.adapterpattern.objectadapterimpl;

import designpattern.structuralpattern.adapterpattern.classadapterimpl.Adaptee;
import designpattern.structuralpattern.adapterpattern.classadapterimpl.AdapterTarget;

public class ObjectAdapterPattern implements AdapterTarget {
    private Adaptee adaptee;
    public ObjectAdapterPattern() {
        this.adaptee = new Adaptee();
    }


    @Override
    public void doubleHoleSocket() {
        this.adaptee.commonThreeHoleSocket();
        System.out.println("switching...");
        System.out.println("I am a double hole socket.");
    }
}
