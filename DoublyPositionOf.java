class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyPositionOf {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.previous = head;
        head.next.next = new Node(30);
        head.next.next.previous = head.next;
        int value = 20;

        Node current = head;
        int position = 1;
        int result = -1;

        while (current != null) {
            if (current.data == value) {
                result = position;
                break;
            }
            current = current.next;
            position++;
        }

        System.out.println(result);
    }
}
