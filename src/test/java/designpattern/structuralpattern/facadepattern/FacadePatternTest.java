package designpattern.structuralpattern.facadepattern;

import org.junit.Test;

public class FacadePatternTest {
    @Test
    public void test1() {
        GeneralSwitchFacade gsf = new GeneralSwitchFacade();
        gsf.on();
        gsf.off();
    }
}
