package concurrent.thread;

/**
 *  实现线程：继承java.lang.Thread，重写run方法
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " === " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("MyThread");
        System.out.println(Thread.currentThread().getName());

        new MyThread().start();
    }
}
