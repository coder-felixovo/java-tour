package designpattern.structuralpattern.adapterpattern.classadapterimpl;

public class Adapter extends Adaptee implements AdapterTarget {
    @Override
    public void doubleHoleSocket() {
        this.commonThreeHoleSocket();
        System.out.println("switching...");
        System.out.println("I am a double hole socket.");
    }
}
