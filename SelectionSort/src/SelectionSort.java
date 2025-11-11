import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] arr){
        int n = arr.length;
        int minIndex;
        for (int i = 0; i < n-1; i++) {
            minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
    System.out.println("Arreglo ordenado");
    System.out.println(Arrays.toString(arr));
    }
}