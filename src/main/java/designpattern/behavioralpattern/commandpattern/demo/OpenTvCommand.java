package designpattern.behavioralpattern.commandpattern.demo;

import designpattern.behavioralpattern.commandpattern.Command;

/**
 * Concrete Command
 */
public class OpenTvCommand implements Command {
    private TV tv;

    public OpenTvCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.open();
    }
}
