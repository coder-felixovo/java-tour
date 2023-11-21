package datastructure.linkedlist.singlelinkedlist;

public class SingleLinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.addLast(1);
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(5);

        singleLinkedList.traverse();
        System.out.println("----------");

        singleLinkedList.addFirst(2);
        singleLinkedList.traverse();
        System.out.println("----------");

        singleLinkedList.addIndex(2, 4);
        singleLinkedList.traverse();
        System.out.println("----------");

        singleLinkedList.remove(5);
        singleLinkedList.traverse();
        System.out.println(singleLinkedList.size());
        System.out.println("----------");

        System.out.println(singleLinkedList.contains(5));
        System.out.println(singleLinkedList.contains(1));

        singleLinkedList.remove(6);
    }
}
