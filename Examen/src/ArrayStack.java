public class ArrayStack<T> {
    private Object[] elements;
    private int top;

    public ArrayStack(int capacity) {
        elements = new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if (top == elements.length - 1)
            throw new IllegalStateException("Stack lleno");
        elements[++top] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty())
            return null;
        return (T) elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]);
            if (i < top)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
