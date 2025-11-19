import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Solicitar N números
        System.out.print("Ingrese la cantidad de números (N): ");
        int N = sc.nextInt();

        int[] numeros = new int[N];

        System.out.println("Ingrese los " + N + " números enteros:");
        for (int i = 0; i < N; i++) {
            numeros[i] = sc.nextInt();
        }

        int countPares = 0, countImpares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) countPares++;
            else countImpares++;
        }

        int[] pares = new int[countPares];
        int[] impares = new int[countImpares];

        int p = 0, im = 0;
        for (int num : numeros) {
            if (num % 2 == 0) pares[p++] = num;
            else impares[im++] = num;
        }

        SelectionSort.selectionSort(pares);
        SelectionSort.selectionSort(impares);

        System.out.println("\nArreglo original:");
        imprimir(numeros);

        System.out.println("Arreglo de pares ordenado:");
        imprimir(pares);

        System.out.println("Arreglo de impares ordenado:");
        imprimir(impares);
    }
    public static void imprimir(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
