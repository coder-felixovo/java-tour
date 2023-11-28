package designpattern.behavioralpattern.mementopattern;

/**
 * Caretaker 管理者类
 */
public class Caretaker {
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
