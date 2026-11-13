class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SinglyListSize {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        System.out.println(size);
    }
}
