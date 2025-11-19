import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        System.out.println("Ingrese los " + n + " números enteros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = numeros[i];
        }

        System.out.println("\nArreglo original:");
        imprimir(original);

        BubbleSort.bubbleSort(numeros);

        int minimo = numeros[0];
        int maximo = numeros[numeros.length - 1];
        int diferencia = maximo - minimo;

        System.out.println("\nArreglo ordenado:");
        imprimir(numeros);

        System.out.println("\nValor mínimo: " + minimo);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Diferencia (máximo - mínimo): " + diferencia);
    }

    public static void imprimir(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
