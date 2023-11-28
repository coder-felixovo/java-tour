package designpattern.behavioralpattern.templatemethod;

public class ReadBean extends SoybeanMilk {
    @Override
    void addCondiment() {
        System.out.println("Second: add fresh red bean.");
    }
}
