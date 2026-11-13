class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyInsert {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(30);
        head.next = second;
        second.previous = head;
        Node tail = second;

        int position = 2;
        int value = 20;
        Node newNode = new Node(value);

        if (position == 1) {
            newNode.next = head;
            if (head != null) {
                head.previous = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        } else if (position == 3) {
            if (tail != null) {
                tail.next = newNode;
                newNode.previous = tail;
            }
            tail = newNode;
        } else {
            Node current = head;
            int count = 1;

            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }

            if (current != null && current.next != null) {
                newNode.next = current.next;
                newNode.previous = current;
                current.next.previous = newNode;
                current.next = newNode;
            }
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
