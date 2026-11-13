class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyListSize {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.previous = head;
        head.next.next = new Node(30);
        head.next.next.previous = head.next;

        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        System.out.println(size);
    }
}
