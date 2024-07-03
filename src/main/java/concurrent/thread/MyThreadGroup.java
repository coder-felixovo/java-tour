package concurrent.thread;

/**
 * 实现线程：使用ThreadGroup线程组
 */
public class MyThreadGroup {
    public static void main(String[] args) {
        System.out.println("MyThreadGroup");
        System.out.println(Thread.currentThread().getName());

        ThreadGroup group = new ThreadGroup("groupName");
        String threadName1 = "Thread1";
        String threadName2 = "Thread2";
        String threadName3 = "Thread3";

        new Thread(group, () -> {
            System.out.println(threadName1 + " === " + Thread.currentThread().getName());
        }, threadName1).start();

        new Thread(group, () -> {
            System.out.println(threadName2 + " === " + Thread.currentThread().getName());
        }, threadName2).start();

        new Thread(group, () -> {
            System.out.println(threadName3 + " === " + Thread.currentThread().getName());
        }, threadName3).start();
    }
}
