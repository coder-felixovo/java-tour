package concurrent.keyword;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VolatileAtomicityDemo1 {
    public volatile static int counter = 0;

    public AtomicInteger atomicCounter = new AtomicInteger();

    Lock lock = new ReentrantLock();

    // 1. increase()方法使用synchronized关键字修饰
    // 2. 使用AtomicInteger
    // 3. 使用ReentrantLock
    public void increase() {
//        counter++;
//        atomicCounter.getAndIncrement();
        lock.lock();
        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        VolatileAtomicityDemo1 volatileAtomicityDemo1 = new VolatileAtomicityDemo1();

        for (int i = 0; i < 5; i++) {
            threadPool.execute(() -> {
                for (int j = 0; j < 500; j++) {
                    volatileAtomicityDemo1.increase();
                }
            });
        }

        Thread.sleep(2000);
        System.out.println(counter);
//        System.out.println(volatileAtomicityDemo1.atomicCounter);
        threadPool.shutdown();
    }
}
