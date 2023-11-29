package designpattern.behavioralpattern.statepattern;

import java.util.Objects;

public class Logistics {
    private LogisticsState logisticsState;

    public void setLogisticsState(LogisticsState logisticsState) {
        this.logisticsState = logisticsState;
    }

    public LogisticsState getLogisticsState() {
        return logisticsState;
    }

    public void doAction() {
        Objects.requireNonNull(logisticsState);
        logisticsState.doAction(this);
    }
}
