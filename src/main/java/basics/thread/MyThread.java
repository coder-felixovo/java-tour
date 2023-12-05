package basics.thread;

/**
 *  实现线程：类继承java.lang.Thread，重写run方法
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("分支线程 ---> " + i);
        }
    }
}
