package designpattern.behavioralpattern.commandpattern.demo;

import designpattern.behavioralpattern.commandpattern.Command;

/**
 * Concrete Command
 */
public class ChangeTvCommand implements Command {
    private TV tv;

    public ChangeTvCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.change();
    }
}
