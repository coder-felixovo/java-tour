package designpattern.behavioralpattern.commandpattern;

/**
 * 具体命令角色 Concrete Command
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action();
    }
}
