public class Main {
    public static void main(String[] args) {

        double[] temperaturas = {12.5, 8.2, 30.1, 14.0, 22.9, 17.3, 3.8, 9.9};

        double[] original = new double[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            original[i] = temperaturas[i];
        }

        System.out.println("Arreglo original:");
        imprimir(original);

        InsertionSort.insertionSort(temperaturas);

        double min = temperaturas[0];
        double max = temperaturas[temperaturas.length - 1];
        double rango = max - min;

        double[] bajas = obtenerTresPrimeros(temperaturas);

        double[] altas = obtenerTresUltimos(temperaturas);

        System.out.println("\nArreglo ordenado:");
        imprimir(temperaturas);

        System.out.println("\nTemperatura mínima: " + min);
        System.out.println("Temperatura máxima: " + max);
        System.out.println("Rango (max - min): " + rango);

        System.out.println("\n3 temperaturas más bajas:");
        imprimir(bajas);

        System.out.println("3 temperaturas más altas:");
        imprimir(altas);
    }

    public static double[] obtenerTresPrimeros(double[] arr) {
        int n = Math.min(3, arr.length);
        double[] resultado = new double[n];

        for (int i = 0; i < n; i++) {
            resultado[i] = arr[i];
        }
        return resultado;
    }

    public static double[] obtenerTresUltimos(double[] arr) {
        int n = Math.min(3, arr.length);
        double[] resultado = new double[n];

        for (int i = 0; i < n; i++) {
            resultado[i] = arr[arr.length - n + i];
        }
        return resultado;
    }

    public static void imprimir(double[] arr) {
        for (double t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}