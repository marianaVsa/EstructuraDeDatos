public class App {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(5);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(5);

        System.out.println("Lista:");
        list.printList();

        int numeroBuscado = 5;
        int ocurrencias = list.countOccurrences(numeroBuscado);
        System.out.println("Ocurrencias de " + numeroBuscado + ": " + ocurrencias);

        list.remove(3);
        System.out.println("Lista después de eliminar 3:");
        list.printList();
    }
}
