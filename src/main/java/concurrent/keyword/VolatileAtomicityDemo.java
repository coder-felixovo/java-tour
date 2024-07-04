package concurrent.keyword;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  示例：volatile关键字不保证原子性
 */
public class VolatileAtomicityDemo {
    public volatile static int counter = 0;

    public void increase() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        VolatileAtomicityDemo volatileAtomicityDemo = new VolatileAtomicityDemo();

        for (int i = 0; i < 5; i++) {
            threadPool.execute(() -> {
                for (int j = 0; j < 500; j++) {
                    volatileAtomicityDemo.increase();
                }
            });
        }

        Thread.sleep(2000);
        System.out.println(counter);
        threadPool.shutdown();
    }
}
