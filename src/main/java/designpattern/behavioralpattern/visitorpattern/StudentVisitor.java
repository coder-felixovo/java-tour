package designpattern.behavioralpattern.visitorpattern;

/**
 * 具体访问者 Concrete Visitor
 */
public class StudentVisitor implements Visitor {
    @Override
    public void visitPandaSpot(PandaSpot pandaSpot) {
        int price = (int)(pandaSpot.ticketRate() * 0.5);
        System.out.println("学生游览熊猫馆票价：" + price);
    }

    @Override
    public void visitLionSpot(LionSpot lionSpot) {
        int price = (int)(lionSpot.ticketRate() * 0.5);
        System.out.println("学生游览狮子馆票价：" + price);
    }
}
