package Algorithms;

import java.util.Random;

public class BubbleSortAlgorhytm {
    public static void main(String[] args) {
        int[] tab = new int[10];

        tab[0] = 2;
        tab[1] = 5;
        tab[2] = 4;
        tab[3] = 6;
        tab[4] = 7;
        tab[5] = 78;
        tab[6] = 45;
        tab[7] = 23;
        tab[8] = 5;
        tab[9] = 7;

        for (int i = 0; i < tab.length - 1; i++) {
            System.out.println(tab[i]);
        }

        int[] sorted = bubbleSorter(tab);

        for (int i = 0; i <sorted.length-1; i++) {
            System.out.println(sorted[i]);
        }

    }
    public static int[] bubbleSorter (int[] arr) {
        boolean swapNeeded = true;
        int i = 0;
        int n= arr.length;
        while (i < arr.length - 1 && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < arr.length - 1; j++) {
                if ( arr[j-1]> arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded) {
                break;
            }
            i++;
        }
        return arr;
    }
}