class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SinglyInsert {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30);
        int position = 2;
        int value = 20;

        Node newNode = new Node(value);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int count = 1;

            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }

            if (current != null) {
                newNode.next = current.next;
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
