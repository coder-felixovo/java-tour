package basics.thread;

/**
 *  实现线程：实现Runnable接口，重写run方法
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("分支线程 ---> " + i);
        }
    }
}
