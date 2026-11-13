class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SinglyDelete {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        int position = 2;

        if (head != null && position > 0) {
            if (position == 1) {
                head = head.next;
            } else {
                Node current = head;
                int count = 1;

                while (current.next != null && count < position - 1) {
                    current = current.next;
                    count++;
                }

                if (current.next != null) {
                    current.next = current.next.next;
                }
            }
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
