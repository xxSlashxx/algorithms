package de.slash.algorithms.sort;

import java.util.Arrays;

import static de.slash.algorithms.utils.ArrayGenerator.generateArray;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = generateArray();
        System.out.println("The generated array to sort:\n" + Arrays.toString(array));
        sort(array);
        System.out.println("The sorted array:\n" + Arrays.toString(array));
    }

    private static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;

            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }

            array[j] = temp;
        }
    }
}
