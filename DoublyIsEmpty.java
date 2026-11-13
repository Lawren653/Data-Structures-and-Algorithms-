class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyIsEmpty {
    public static void main(String[] args) {
        Node head = null;
        Node tail = null;
        System.out.println(head == null && tail == null);
    }
}
