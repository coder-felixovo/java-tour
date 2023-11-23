package designpattern.structuralpattern.bridgepattern;

import org.junit.Test;

public class BridgePattern {
    @Test
    public void test1() {
        FoldedPhone xiaomi = new FoldedPhone(new Xiaomi());
        xiaomi.open();
        xiaomi.close();
        xiaomi.call();
    }
}
