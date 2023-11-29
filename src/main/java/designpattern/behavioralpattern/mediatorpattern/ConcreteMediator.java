package designpattern.behavioralpattern.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者 Concrete Mediator
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagueList = new ArrayList<Colleague>();

    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague item : colleagueList) {
            if (!item.equals(colleague)) {
                item.receive();
            }
        }
    }
}
