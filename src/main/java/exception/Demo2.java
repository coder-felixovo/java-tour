package exception;

public class Demo2 {
    public static int foo(int val) {
        try {
            return val * val;
        } finally {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(foo(6));
    }
}
