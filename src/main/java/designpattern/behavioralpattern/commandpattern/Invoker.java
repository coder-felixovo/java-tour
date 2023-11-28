package designpattern.behavioralpattern.commandpattern;

/**
 * 调用者角色 Invoker
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
