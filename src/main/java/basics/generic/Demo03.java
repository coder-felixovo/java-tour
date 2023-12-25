package basics.generic;

/**
 * 泛型类
 */
public class Demo03<T> {
    private T data;

    Demo03(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Demo03{" +
                "data=" + data +
                '}';
    }

    public static void main(String[] args) {
        Demo03<Integer> genericInteger = new Demo03<Integer>(100);
        Demo03<String> genericString = new Demo03<String>("hello world");

        System.out.println(genericInteger.getData());
    }
}
