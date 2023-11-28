package designpattern.behavioralpattern.templatemethod;

public abstract class SoybeanMilk {

    final void make() {
        select();
        if (customerWantCondiment()) {
            addCondiment();
        }
        soak();
        beat();
    }

    void select() {
        System.out.println("First: choose fresh soybean.");
    }

    abstract void addCondiment();

    void soak() {
        System.out.println("Third: soak soybean and condiment.");
    }

    void beat() {
        System.out.println("Fourth: put soybean and condiment into the machine.");
    }

    // hook method
    boolean customerWantCondiment() {
        return true;
    }
}
