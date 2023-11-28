package designpattern.behavioralpattern.commandpattern;

import designpattern.behavioralpattern.commandpattern.demo.*;
import org.junit.Test;

public class TvDemoTest {
    @Test
    public void client1() {
        TV tv = new TV();

        Command openTvCommand = new OpenTvCommand(tv);
        Command closeTvCommand = new CloseTvCommand(tv);
        Command changeTvCommand = new ChangeTvCommand(tv);

        TvRemote remote = new TvRemote(openTvCommand, closeTvCommand, changeTvCommand);

        remote.open();
        remote.change();
        remote.close();
    }
}
