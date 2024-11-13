package de.slash.algorithms.sort;

import de.slash.algorithms.utils.ArrayGenerator;

import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {
        int[] array = ArrayGenerator.generateArray();
        System.out.println("The generated array to sort:\n" + Arrays.stream(array).boxed().toList());
        sort(array);
        System.out.println("The sorted array:\n" + Arrays.stream(array).boxed().toList());
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
