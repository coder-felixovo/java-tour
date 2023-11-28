package designpattern.behavioralpattern.commandpattern.demo;

/**
 * Receiver
 */
public class TV {
    public void open() {
        System.out.println("open the tv");
    }

    public void close() {
        System.out.println("close the tv");
    }

    public void change() {
        System.out.println("change channel");
    }
}
