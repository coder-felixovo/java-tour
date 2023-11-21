package datastructure.stack;

public class StackImpl<T> {
    private Node head;
    private int N;
    private class Node {
        private T val;
        private Node next;
        public Node(T val, Node next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }

    public StackImpl() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    public boolean isEmpty() {
        return this.N == 0;
    }

    public int getSize() {
        return this.N;
    }

    public void push(T t) {
        if (this.N == 0) {
            Node newNode = new Node(t, null);
            this.head.next = newNode;
        } else {
            Node top = this.head.next;
            Node newNode = new Node(t, top);
            this.head.next = newNode;
        }
        this.N++;
    }

    public T pop() {
        if (this.head.next == null) {
            return null;
        }
        Node top = head.next;
        Node topNext = head.next.next;
        head.next = topNext;
        this.N--;
        return top.val;
    }

    public T getTop() {
        return this.head.next.val;
    }

    public boolean contains(T t) {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
            if (cur.val == t) return true;
        }
        return false;
    }

    public void traverse() {
        if (this.head.next == null) {
            System.out.println("Empty stack");
        } else {
            Node cur = this.head.next;
            while (cur != null) {
                System.out.println(cur.toString());
                cur = cur.next;
            }
        }
    }
}
