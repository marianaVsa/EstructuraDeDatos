public class DoubleLinkedList {

    private class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void remove(int value) {
        if (head == null) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }

        Node current = head;
        while (current != null && current.value != value) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Valor no encontrado.");
            return;
        }

        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Elemento " + value + " eliminado.");
    }

    public void printList() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node current = head;
        System.out.print("Lista: ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Antes de eliminar:");
        list.printList();

        list.remove(10);
        list.remove(30);
        list.remove(50);
        list.remove(99);

        System.out.println("Después de eliminar:");
        list.printList();
    }
}