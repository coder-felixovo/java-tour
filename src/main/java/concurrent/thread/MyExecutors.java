package concurrent.thread;

import java.util.concurrent.*;

/**
 * 实现线程：使用Executors创建线程池或自定义线程池
 */
public class MyExecutors {
    public static void main(String[] args) {
        System.out.println("MyExecutors");
        System.out.println(Thread.currentThread().getName());

        // 创建线程池
        ExecutorService poolA = Executors.newFixedThreadPool(2);
        poolA.execute(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + " === " + i);
            }
        });
        poolA.shutdown();

        // 自定义线程池
        ThreadPoolExecutor poolB = new ThreadPoolExecutor(2, 3, 0,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(3),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
                );
        poolB.submit(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + " === " + i);
            }
        });
        poolB.shutdown();
    }
}
