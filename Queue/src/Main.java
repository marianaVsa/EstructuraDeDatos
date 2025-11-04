public class Main {
    public static void main(String[] args) {
        ArrayQueue<Customer> queue = new ArrayQueue<>(10);
        queue.enqueue(new Customer(1, "Ana"));
        queue.enqueue(new Customer(2, "Luis"));
        queue.enqueue(new Customer(3, "Maya"));
        queue.enqueue(new Customer(4, "Pedro"));
        queue.enqueue(new Customer(5, "Lucía"));

        System.out.println("Antes de invertir:");
        System.out.println(queue);

        int before = queue.size();

        queue.reverse();

        System.out.println("Después de invertir:");
        System.out.println(queue);

        int after = queue.size();
        System.out.println("Elementos antes = " + before + ", elementos después = " + after);
    }
}