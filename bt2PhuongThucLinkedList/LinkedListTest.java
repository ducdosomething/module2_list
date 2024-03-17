package bt2PhuongThucLinkedList;

/**
 * LinkedListTest
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        linkedList.addFirst(14);
        System.out.println("Linked list: ");
        linkedList.printList();

        System.out.println("---------------------");
        linkedList.add(3, 5);
        linkedList.add(3, 67);
        System.out.println("LinkedList after add: ");
        linkedList.printList();

        System.out.println("---------------------");
        linkedList.addLast(46);
        System.out.println("LinkedList after add Last: ");
        linkedList.printList();
    }
}