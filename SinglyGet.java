class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SinglyGet {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        int position = 2;

        Node current = head;
        int count = 1;

        while (current != null && count < position) {
            current = current.next;
            count++;
        }

        if (current != null && position > 0) {
            System.out.println(current.data);
        } else {
            System.out.println("Wrong Position");
        }
    }
}
