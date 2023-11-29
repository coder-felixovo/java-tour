package designpattern.behavioralpattern.visitorpattern;

/**
 * 具体元素 Concrete Element
 */
public class LionSpot implements ScenerySpot {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitLionSpot(this);
    }

    @Override
    public Integer ticketRate() {
        return 2000;
    }
}
