package datastructure.linkedlist.doublelinkedlist;

public class DoubleLinkedList {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    private static class Node {
        private int val;
        private Node prev;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public int getVal() {
            return this.val;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public boolean addFirst(int data) {
        Node newNode = new Node(data);

        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }

        this.size++;
        return true;
    }

    public boolean addLast(int data) {
        if (this.size == 0) {
            return addFirst(data);
        } else {
            Node newNode = new Node(data);
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
            this.size++;
            return true;
        }
    }

    public boolean addIndex(int index, int data) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            return addFirst(data);
        } else if (index ==  this.size) {
            return addLast(data);
        } else {
            Node newNode = new Node(data);
            Node cur = this.head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            newNode.next = cur.next;
            cur.next = newNode;
            newNode.prev = cur;
            newNode.next.prev = newNode;
        }
        this.size++;
        return true;
    }

    public int removeFirst() {
        if (this.size == 0) {
            throw new RuntimeException("Empty double linked list");
        }
        int data = this.head.val;
        Node newHead = this.head.next;
        newHead.setPrev(null);
        this.head = newHead;
        this.size--;
        return data;
    }

    public int removeLast() {
        if (this.size == 0) {
            throw new RuntimeException("Empty double linked list");
        }
        int data = this.tail.val;
        Node newLast = this.tail.prev;
        newLast.setNext(null);
        this.tail = newLast;
        this.size--;
        return data;
    }

    public int removeIndex(int index) {
        if (index < 0 || index > this.size - 1) {
            throw  new IndexOutOfBoundsException();
        } else if (index == 0) {
            return removeFirst();
        } else if (index == this.size - 1) {
            return removeLast();
        } else {
            Node cur = this.head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            Node delNode = cur.next;
            int data = delNode.val;
            cur.next = delNode.next;
            delNode.next.prev = cur;
            delNode.setNext(null);
            delNode.setPrev(null);
            this.size--;
            return data;
        }
    }

    public int getSize() {
        return this.size;
    }

    public void traverse() {
        if (this.size != 0) {
            int count = 1;
            Node cur = this.head;
            while (cur != null) {
                System.out.println("第" + count + "个节点，值为：" + cur.val);
                count++;
                cur = cur.next;
            }
        } else {
            System.out.println("Empty double linked list");
        }
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
}
