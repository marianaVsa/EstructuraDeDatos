import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] arr){
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    //se realiza el intercambio
                    int temporal = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temporal;
                    swapped = true;
                }
            }
            if (!swapped) break; //si no hubo intercambios, el arreglo ya está ordenado
            break;
        }
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(arr));
    }
}