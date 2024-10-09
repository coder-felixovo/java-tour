package concurrent.thread;

/**
 *  实现线程：继承java.lang.Thread，重写run方法
 */
// 1. 定义Thread类的子类
public class MyThread extends Thread {
    // 2. 重写run()方法
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " === " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("MyThread");
        System.out.println(Thread.currentThread().getName());
        // 3. 创建Thread子类实例，创建线程实例
        MyThread myThread = new MyThread();
        // 4. 调用线程实例的start()方法启动线程
        myThread.start();
    }
}
