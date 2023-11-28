package designpattern.behavioralpattern.templatemethod;

import org.junit.Test;

public class TemplateMethodTest {
    @Test
    public void test1() {
        SoybeanMilk redBeanSoybeanMilk = new ReadBean();
        redBeanSoybeanMilk.make();
    }

    @Test
    public void test2() {
        SoybeanMilk peanutSoybeanMilk = new Pure();
        peanutSoybeanMilk.make();
    }
}
