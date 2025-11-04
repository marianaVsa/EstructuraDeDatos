import java.util.Stack;

public class ArrayQueue<T> {
    private Object[] elements;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity) {
        elements = new Object[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(T item) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue llena");
        }
        elements[rear] = item;
        rear = (rear + 1) % elements.length;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue vacía");
        }
        T item = (T) elements[front];
        front = (front + 1) % elements.length;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void reverse() {
        Stack<T> stack = new Stack<>();
        while (!isEmpty()) {
            stack.push(dequeue());
        }
        while (!stack.isEmpty()) {
            enqueue(stack.pop());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % elements.length;
            sb.append(elements[index]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}