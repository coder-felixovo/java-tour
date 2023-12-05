package basics.thread;

import org.junit.Test;

public class ThreadSleepTest {
    @Test
    public void test1() {
        // 每打印一次数字，线程睡眠1s
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "--->begin");
                try {
                    // 分支线程睡眠1年
                    Thread.sleep(1000 * 60 * 60 * 24 * 365);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "--->end");
            }
        });

        t2.setName("t1");
        t2.start();

        try {
            Thread.sleep(1000 * 5);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 5s之后终断t1线程睡眠
        t2.interrupt();
    }
}
