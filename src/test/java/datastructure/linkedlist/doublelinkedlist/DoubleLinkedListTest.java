package datastructure.linkedlist.doublelinkedlist;

public class DoubleLinkedListTest {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.addLast(1);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addLast(5);
        doubleLinkedList.traverse();
        System.out.println("----------");

        doubleLinkedList.addFirst(2);
        doubleLinkedList.traverse();
        System.out.println("----------");

        doubleLinkedList.addIndex(2, 4);
        doubleLinkedList.traverse();
        System.out.println("----------");

        doubleLinkedList.removeFirst();
        doubleLinkedList.removeLast();
        doubleLinkedList.traverse();
        System.out.println("----------");

        doubleLinkedList.removeIndex(1);
        doubleLinkedList.traverse();
        System.out.println("----------");

        doubleLinkedList.clear();
        doubleLinkedList.traverse();
    }
}
