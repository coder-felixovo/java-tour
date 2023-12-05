package basics.thread;

import org.junit.Test;

public class MyRunnableTest {
    @Test
    public void test1() {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        for (int i = 0; i < 30; i++) {
            System.out.println("主线程 ---> " + i);
        }
    }

    @Test
    public void test2() {
        // 采用匿名内部类的方式创建线程对象
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    System.out.println("分支线程 ---> " + i);
                }
            }
        });

        thread.start();

        for (int i = 0; i < 30; i++) {
            System.out.println("主线程 ---> " + i);
        }
    }
}
