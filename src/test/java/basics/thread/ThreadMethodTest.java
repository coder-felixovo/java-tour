package basics.thread;

import org.junit.Test;

public class ThreadMethodTest {
    @Test
    public void test() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // static Thread currentThread() 获取当前线程对象
                Thread curT = Thread.currentThread();

                // String getName() 获取当前线程对象名称
                System.out.println("t1 original thread name: " + curT.getName());

                // void setName(String name) 修改当前线程对象名称
                curT.setName("a");
                System.out.println("t1 current thread name: " + curT.getName());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread curT = Thread.currentThread();
                System.out.println("t2 original thread name: " + curT.getName());
            }
        });

        t2.start();
        t1.start();

        System.out.println("主线程main方法");
    }
}
