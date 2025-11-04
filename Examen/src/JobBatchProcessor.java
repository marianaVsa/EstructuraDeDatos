import java.util.Scanner;

public class JobBatchProcessor {
    private ArrayQueue<Job> queue = new ArrayQueue<>(50);
    private ArrayStack<Job> stack = new ArrayStack<>(50);
    private SinglyLinkedList<Job> log = new SinglyLinkedList<>();

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese comandos (END para finalizar):");

        while (true) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] parts = line.split("\\s+");
            String command = parts[0].toUpperCase();

            switch (command) {
                case "ADD":
                    if (parts.length < 2) {
                        System.out.println("Falta ID de trabajo");
                        break;
                    }
                    queue.enqueue(new Job(parts[1]));
                    break;

                case "PROCESS":
                    if (parts.length < 2) {
                        System.out.println("Falta número de trabajos a procesar");
                        break;
                    }
                    try {
                        int n = Integer.parseInt(parts[1]);
                        for (int i = 0; i < n; i++) {
                            Job job = queue.dequeue();
                            if (job == null) break;
                            stack.push(job);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Número inválido en PROCESS");
                    }
                    break;

                case "COMMIT":
                    while (!stack.isEmpty()) {
                        log.addLast(stack.pop());
                    }
                    break;

                case "ROLLBACK":
                    if (parts.length < 2) {
                        System.out.println("Falta número de trabajos a revertir");
                        break;
                    }
                    try {
                        int m = Integer.parseInt(parts[1]);
                        for (int i = 0; i < m; i++) {
                            if (log.size() == 0) break;
                            Job job = log.removeLast();
                            queue.addFront(job);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Número inválido en ROLLBACK");
                    }
                    break;

                case "PRINT":
                    printState();
                    break;

                case "END":
                    System.out.println("=== ESTADO FINAL ===");
                    printState();
                    sc.close();
                    return;

                default:
                    System.out.println("Comando no reconocido: " + command);
            }
        }
    }

    private void printState() {
        System.out.println("QUEUE (pendientes): " + queue);
        System.out.println("STACK (procesando): " + stack);
        System.out.println("BITÁCORA (confirmados): " + log);
        System.out.println();
    }
}