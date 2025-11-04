public class MyStack<T> {
    private Object[] elements;
    private int top;

    public MyStack(int capacity) {
        elements = new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if (top == elements.length - 1) {
            throw new IllegalStateException("Pila llena");
        }
        elements[++top] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pila vacía");
        }
        return (T) elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}