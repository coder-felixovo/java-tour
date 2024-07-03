package concurrent.thread;

/**
 *  实现线程：实现Runnable接口，重写run方法
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " === " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("MyRunnable");
        System.out.println(Thread.currentThread().getName());

        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();
    }
}
