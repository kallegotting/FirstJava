package Labb5;

import java.util.Arrays;
import java.util.Random;

public class uppgift4 {
    public static void swap(int[] l, int first) {
        int hold = l[first];
        l[first] = l[first + 1];
        l[first + 1] = hold;
    }

    public static void bubblesort(int[] lista) {
        for (int i = 1; i < lista.length; i++) {
            for (int j = 0; j < lista.length - 1; j++)
                if (lista[j] > lista[j + 1]) {
                    swap(lista, j);
                }
        }
    }

    public static void selectionSort(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            int currentMin = lista[i];
            int currentMinIndex = i;

            for (int j = i +1; j < lista.length; j++) {
                if (currentMin > lista[j]) {
                    currentMin = lista[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                lista[currentMinIndex] = lista[i];
                lista[i] = currentMin;
            }
        }
    }

    public static void meny() {
        System.out.println("Sorteringstider");
        System.out.println("===============");
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] bubblor = new int[10000];

        int[] bubblor1 = new int[10000];
        int[] bubblor2 = new int[10000];
        int[] bubblor3 = new int[10000];

        for (int i = 0; i < 10000; i++) {
            bubblor[i] = rnd.nextInt(9) + 1;
        }
        System.arraycopy(bubblor, 0, bubblor1, 0, 0);
        System.arraycopy(bubblor, 0, bubblor2, 0, 0);
        System.arraycopy(bubblor, 0, bubblor3, 0, 0);

        long startTime = System.nanoTime();
        bubblesort(bubblor1);
        long stopTime = System.nanoTime();

        long time = stopTime - startTime;

        long startTime2 = System.nanoTime();
        selectionSort(bubblor2);
        long stopTime2 = System.nanoTime();

        long time2 = stopTime2 - startTime2;

        long startTime3 = System.nanoTime();
        Arrays.sort(bubblor3);
        long stopTime3 = System.nanoTime();

        long time3 = stopTime3 - startTime3;

        meny();
        System.out.println("Bubbelsortering " + time + " nanosekunder");
        System.out.println("Urvalssortering " + time2 + " nanosekunder");
        System.out.println("Intern quicksort " + time3 + " nanosekunder");
    }
}

