package datastructure.linkedlist.singlelinkedlist;

public class SingleLinkedList {
    public int size = 0;
    public SingleLinkedListNode head = null;

    public SingleLinkedList() {}

    public void addFirst(int data) {
        SingleLinkedListNode newNode = new SingleLinkedListNode(data);

        if (this.head != null) {
            newNode.next = head;
        }
        this.head = newNode;

        this.size++;
    }

    public void addLast(int data) {
        SingleLinkedListNode newNode = new SingleLinkedListNode(data);

        if (head == null) {
            this.head = newNode;
            this.size++;
            return;
        }

        SingleLinkedListNode cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;

        this.size++;
    }

    public void addIndex(int index, int data) {

        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size()) {
            addLast(data);
            return;
        }

        SingleLinkedListNode prev = this.head;
        while (index - 1 > 0) {
            prev = prev.next;
            index--;
        }

        SingleLinkedListNode newNode = new SingleLinkedListNode(data);

        newNode.next = prev.next;
        prev.next = newNode;

        this.size++;
    }

    public void remove(int data) {

        if (this.head.val == data) {
            this.head = this.head.next;
            return;
        }

        SingleLinkedListNode prev = this.head;
        while (prev.next != null) {
            if (prev.next.val == data) {
                break;
            }
            prev = prev.next;
        }

        SingleLinkedListNode delNode = prev.next;

        if (delNode == null) {
            throw new Error("Not Found");
        }

        prev.next = delNode.next;

        this.size--;
    }

    public boolean contains(int data) {
        SingleLinkedListNode cur = this.head;
        while (cur != null) {
            if (cur.val == data) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    public void traverse() {
        SingleLinkedListNode cur = this.head;

        int count = 1;
        while (cur != null) {
            System.out.println("第" + count + "个节点，值为：" + cur.val);
            count++;
            cur = cur.next;
        }
    }

    public void clear() {}
}
