package concurrent.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现线程：实现Callable接口，重新call方法
 */
// 1. 定义Callable接口实现类
public class MyCallable implements Callable {
    // 2. 重写call()方法
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " === " + i);
        }
        return "OK";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("MyCallable");
        System.out.println(Thread.currentThread().getName());
        // 3. 创建Callable接口实现类的实例
        MyCallable myCallable = new MyCallable();
        // 4. 创建FutureTask实例，包装Callable实例
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        // 5. 创建Thread实例，将FutureTask实例作为Thread的target
        Thread thread = new Thread(futureTask);
        // 6. 调用Thread实例的start()方法启动线程
        thread.start();
        // 7. 调用FutureTask实例的get()方法获取线程的返回值
        System.out.println(futureTask.get());
    }
}
