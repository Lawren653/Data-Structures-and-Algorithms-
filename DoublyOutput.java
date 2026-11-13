class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyOutput {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.previous = head;
        head.next.next = new Node(30);
        head.next.next.previous = head.next;

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
