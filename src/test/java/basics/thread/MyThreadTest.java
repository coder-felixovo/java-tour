package basics.thread;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

//        thread.run();
        // 上面这行代码不会启动线程，只是普通的方法调用

        thread.start();
        // 启动一个分支线程，在JVM中开辟一个新的栈空间，启动成功的线程会自动调用run方法
        // run方法在分支栈的栈底，main方法在主栈的栈底，run和main平级

        for (int i = 0; i < 30; i++) {
            System.out.println("主线程 ---> " + i);
        }
    }
}
