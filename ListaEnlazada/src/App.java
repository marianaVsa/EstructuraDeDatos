public class App {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("Lista original: ");
        list.printList();

        CustomLinkedList[] result = list.splitEvenOdd();
        CustomLinkedList pares = result[0];
        CustomLinkedList impares = result[1];

        System.out.print("Pares: ");
        pares.printList();

        System.out.print("Impares: ");
        impares.printList();
    }
}