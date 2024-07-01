package exception;

public class Demo3 {
    public static void main(String[] args) {
        try {
            System.out.println("Try to do something but an exception occurs");
            throw new RuntimeException("RuntimeException");
        } catch (Exception e) {
            System.out.println("Catch exception: " + e.getMessage());
            // 终止Java虚拟机的运行
            System.exit(1);
        } finally {
            System.out.println("Finally");
        }
    }
}
