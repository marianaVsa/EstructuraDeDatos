public class App {
    public static void main(String[] args) throws Exception {

        ArrayStack<Integer> myStack = new ArrayStack<>();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        
        System.out.println("Después de agregar elementos:");
        myStack.printStack();

        myStack.pop();

        System.out.println("Después de quitar un elemento:");
        myStack.printStack();

        myStack.clear();  // 👉 Probando el método clear()

        System.out.println("Después de limpiar la pila:");
        myStack.printStack();
    }
}
