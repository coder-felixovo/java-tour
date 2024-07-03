package concurrent.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * 实现线程：使用CompletableFuture
 */
public class MyCompletableFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("MyCompletableFuture");
        System.out.println(Thread.currentThread().getName());

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + " === " + i);
            }
            return "OK";
        });
        Thread.sleep(2000);
        System.out.println(completableFuture.get());
    }
}
