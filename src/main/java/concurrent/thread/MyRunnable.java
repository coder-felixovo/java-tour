package concurrent.thread;

/**
 *  实现线程：实现Runnable接口，重写run方法
 */
// 1. 定义Runnable接口实现类
public class MyRunnable implements Runnable {
    // 2. 重写run()方法
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " === " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("MyRunnable");
        System.out.println(Thread.currentThread().getName());
        // 3. 创建Runnable实现类的实例，将其作为Thread的target
        MyRunnable myRunnable = new MyRunnable();
        // 4. 创建Thread实例
        Thread thread = new Thread(myRunnable);
        // 5. 调用线程实例的start()方法启动线程
        thread.start();
    }
}
