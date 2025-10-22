public class App {
    public static void main(String[] args) throws Exception {

        ArrayQueue<Character> customQueue = new ArrayQueue<>();

        customQueue.println();
        customQueue.offer('A');
        customQueue.offer('B');
        customQueue.poll();
        System.out.println("-------------------------------");
        customQueue.println();
        customQueue.offer('C');
        customQueue.offer('D');
        customQueue.offer('E');
        customQueue.offer('F');
        System.out.println("-------------------------------");
        customQueue.println();
    }
}
