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
        if (size == elements.length)
            throw new IllegalStateException("Cola llena");
        elements[rear] = item;
        rear = (rear + 1) % elements.length;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty())
            return null;
        T item = (T) elements[front];
        front = (front + 1) % elements.length;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFront(T item) {
        if (size == elements.length)
            throw new IllegalStateException("Cola llena");
        front = (front - 1 + elements.length) % elements.length;
        elements[front] = item;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % elements.length;
            sb.append(elements[idx]);
            if (i < size - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
