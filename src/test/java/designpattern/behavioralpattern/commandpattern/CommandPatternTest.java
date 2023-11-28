package designpattern.behavioralpattern.commandpattern;

import org.junit.Test;

public class CommandPatternTest {
    @Test
    public void client1() {
        // create a receiver
        Receiver receiver = new Receiver();
        // create a command and set the receiver
        Command command = new ConcreteCommand(receiver);
        // create an invoker and set the command
        Invoker invoker = new Invoker(command);
        // execute
        invoker.action();
    }
}
