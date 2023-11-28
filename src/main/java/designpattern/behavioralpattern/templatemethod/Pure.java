package designpattern.behavioralpattern.templatemethod;

public class Pure extends SoybeanMilk {
    @Override
    void addCondiment() {
    }

    @Override
    boolean customerWantCondiment() {
        return false;
    }
}
