package designpattern.behavioralpattern.commandpattern.demo;

import designpattern.behavioralpattern.commandpattern.Command;

/**
 * Concrete Command
 */
public class CloseTvCommand implements Command {
    private TV tv;

    public CloseTvCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.close();
    }
}
