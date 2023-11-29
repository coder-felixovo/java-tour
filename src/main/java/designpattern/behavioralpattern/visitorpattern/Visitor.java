package designpattern.behavioralpattern.visitorpattern;

/**
 * 抽象访问者 Visitor
 */
public interface Visitor {
    void visitPandaSpot(PandaSpot pandaSpot);
    void visitLionSpot(LionSpot lionSpot);
}
