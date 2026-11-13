class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyDelete {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.previous = head;
        second.next = third;
        third.previous = second;
        Node tail = third;

        int position = 2;

        if (head != null && position > 0) {
            if (position == 1) {
                head = head.next;
                if (head != null) {
                    head.previous = null;
                } else {
                    tail = null;
                }
            } else {
                Node current = head;
                int count = 1;

                while (current != null && count < position) {
                    current = current.next;
                    count++;
                }

                if (current != null) {
                    if (current.previous != null) {
                        current.previous.next = current.next;
                    }
                    if (current.next != null) {
                        current.next.previous = current.previous;
                    } else {
                        tail = current.previous;
                    }
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
