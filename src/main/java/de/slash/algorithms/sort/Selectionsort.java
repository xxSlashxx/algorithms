package de.slash.algorithms.sort;

import java.util.Arrays;

import static de.slash.algorithms.utils.ArrayGenerator.generateArray;

public class Selectionsort {

    public static void main(String[] args) {
        int[] array = generateArray();
        System.out.println("The generated array to sort:\n" + Arrays.toString(array));
        sort(array);
        System.out.println("The sorted array:\n" + Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexSmallestNumber = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexSmallestNumber]) {
                    indexSmallestNumber = j;
                }
            }

            swap(array, indexSmallestNumber, i);
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
