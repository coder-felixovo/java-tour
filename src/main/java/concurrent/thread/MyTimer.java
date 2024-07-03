package concurrent.thread;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {
    public static void main(String[] args) {
        System.out.println("MyTimer");
        System.out.println(Thread.currentThread().getName());

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer");
            }
        }, 0, 2000);
    }
}
