import java.util.Arrays;

public class ArrayStack<T> implements MyStack<T> {

    private Object[] data;
    private int top;

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int initialCapacity) {
        this.data = new Object[initialCapacity];
    }

    @Override
    public void push(T value) {
        this.data[top++] = value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("No hay elementos en stack");
            return null;
        }
        T value = (T) data[--top];
        data[top] = null;
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía, no puedes obtener ningún elemento");
            return null;
        }
        return (T) data[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public void clear() {
        for (int i = 0; i < top; i++) {
            data[i] = null;
        }
        top = 0;
    }

    public void addCapacity() {
        if (top == data.length) {
            int newCap = data.length * 2;
            data = Arrays.copyOf(data, newCap);
        }
    }

    @Override
    public void printStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía, no puedes obtener ningún elemento");
            return;
        }
        System.out.println("Elementos en la pila:");
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }
}
