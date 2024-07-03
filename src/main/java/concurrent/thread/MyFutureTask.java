package concurrent.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyFutureTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("MyFutureTask");
        System.out.println(Thread.currentThread().getName());

        FutureTask<String> futureTask = new FutureTask<>(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + " === " + i);
            }
            return "OK";
        });
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
