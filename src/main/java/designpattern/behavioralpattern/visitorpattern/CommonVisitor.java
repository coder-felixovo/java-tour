package designpattern.behavioralpattern.visitorpattern;

/**
 * 具体访问者 Concrete Visitor
 */
public class CommonVisitor implements Visitor {
    @Override
    public void visitPandaSpot(PandaSpot pandaSpot) {
        System.out.println("普通游客游览熊猫馆票价：" + pandaSpot.ticketRate());
    }

    @Override
    public void visitLionSpot(LionSpot lionSpot) {
        System.out.println("普通游客游览狮子馆票价：" + lionSpot.ticketRate());
    }
}
