package com.example.Spring.service;

import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class SortService {

    public int [] sort(int[] arc){
        int n = arc.length;
        boolean swapped = true;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arc[j] > arc[j+1]) {
                    // swap arc[j] and arc[j+1]
                    //Si por ejemlo, tenemos 44, 0
                    int temp = arc[j]; // temp = 44
                    arc[j] = arc[j+1]; // arc[j] = 0
                    arc[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        //System.out.println("Array ordenado: \n");
        //System.out.println(Arrays.toString(arc));

        return arc;
    }

}