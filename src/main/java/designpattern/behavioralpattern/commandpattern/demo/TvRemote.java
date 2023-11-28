package designpattern.behavioralpattern.commandpattern.demo;

import designpattern.behavioralpattern.commandpattern.Command;

/**
 * Invoker
 */
public class TvRemote {
    private Command openTvCommand;
    private Command closeTvCommand;
    private Command changeTvCommand;

    public TvRemote(Command openTvCommand, Command closeTvCommand, Command changeTvCommand) {
        this.openTvCommand = openTvCommand;
        this.closeTvCommand = closeTvCommand;
        this.changeTvCommand = changeTvCommand;
    }

    public void open() {
        openTvCommand.execute();
    }

    public void close() {
        closeTvCommand.execute();
    }

    public void change() {
        changeTvCommand.execute();
    }
}
