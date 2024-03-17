package bt2PhuongThucLinkedList;

public class LinkedList {
    private Node head;
    private int numNodes;

    public LinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        Node newNode = new Node(data); // Tạo một nút mới với dữ liệu được cung cấp

        if (head == null) { // Nếu danh sách rỗng, phần tử mới sẽ là phần tử đầu tiên
            head = newNode;
        } else {
            Node current = head;
            // Di chuyển đến nút cuối cùng trong danh sách
            while (current.next != null) {
                current = current.next;
            }
            // Gán phần tử mới vào next của nút cuối cùng
            current.next = newNode;
        }
        numNodes++; // Tăng số lượng phần tử trong danh sách
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public String toString() {
        return "LinkedList [head=" + head + ", numNodes=" + numNodes + "]";
    }
}
