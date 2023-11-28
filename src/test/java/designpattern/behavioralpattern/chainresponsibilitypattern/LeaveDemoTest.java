package designpattern.behavioralpattern.chainresponsibilitypattern;

import designpattern.behavioralpattern.chainresponsibilitypattern.demo.ClassAdviser;
import designpattern.behavioralpattern.chainresponsibilitypattern.demo.Dean;
import designpattern.behavioralpattern.chainresponsibilitypattern.demo.DepartmentHead;
import designpattern.behavioralpattern.chainresponsibilitypattern.demo.Leader;
import org.junit.Test;

public class LeaveDemoTest {
    @Test
    public void client1() {
        Leader classAdviser = new ClassAdviser();
        classAdviser.handleRequest(2);
    }

    @Test
    public void client2() {
        Leader classAdviser = new ClassAdviser();
        classAdviser.handleRequest(3);
    }

    @Test
    public void client3() {
        Leader departmentHead = new DepartmentHead();
        departmentHead.handleRequest(5);
    }

    @Test
    public void client4() {
        Leader departmentHead = new DepartmentHead();
        departmentHead.handleRequest(6);
    }

    @Test
    public void client5() {
        Leader dean = new Dean();
        dean.handleRequest(7);
    }

    @Test
    public void client6() {
        Leader dean = new Dean();
        dean.handleRequest(8);
    }
}
