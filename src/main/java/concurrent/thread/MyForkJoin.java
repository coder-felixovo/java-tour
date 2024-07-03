package concurrent.thread;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class MyForkJoin {
    public static void main(String[] args) {
        System.out.println("MyForkJoin");
        System.out.println(Thread.currentThread().getName());

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + " === " + i);
            }
        });

        List<String> list = Collections.emptyList();
        list.parallelStream().forEach(System.out::println);
    }
}
