public class SinglyLinkedList<T> {
    private class Node {
        T data;
        Node next;
        Node(T data) { this.data = data; }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addLast(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T removeLast() {
        if (head == null) return null;
        if (head == tail) {
            T data = head.data;
            head = tail = null;
            size = 0;
            return data;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        T data = tail.data;
        tail = current;
        tail.next = null;
        size--;
        return data;
    }

    public int size() { return size; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null)
                sb.append(" -> ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
