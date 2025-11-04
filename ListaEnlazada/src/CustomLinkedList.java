public class CustomLinkedList {
    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public CustomLinkedList[] splitEvenOdd() {
        CustomLinkedList evenList = new CustomLinkedList();
        CustomLinkedList oddList = new CustomLinkedList();

        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                evenList.add(current.data);
            } else {
                oddList.add(current.data);
            }
            current = current.next;
        }

        return new CustomLinkedList[] { evenList, oddList };
    }
}
