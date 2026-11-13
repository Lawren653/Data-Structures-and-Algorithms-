class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SinglyPositionOf {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
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
