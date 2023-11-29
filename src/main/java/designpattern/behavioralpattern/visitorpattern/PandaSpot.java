package designpattern.behavioralpattern.visitorpattern;

/**
 * 具体元素 Concrete Element
 */
public class PandaSpot implements ScenerySpot{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPandaSpot(this);
    }

    @Override
    public Integer ticketRate() {
        return 2500;
    }
}
