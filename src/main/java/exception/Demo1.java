package exception;

public class Demo1 {
    public static void main(String[] args) {
        try {
            System.out.println("Try to do something but an exception occurs");
            throw new RuntimeException("RuntimeException");
        } catch (Exception e) {
            System.out.println("Catch exception");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.toString(): " + e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }
}