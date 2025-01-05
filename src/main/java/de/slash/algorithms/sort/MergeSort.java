package de.slash.algorithms.sort;

import java.util.Arrays;

import static de.slash.algorithms.utils.ArrayGenerator.generateArray;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = generateArray();
        System.out.println("The generated array to sort:\n" + Arrays.toString(array));
        sort(array);
        System.out.println("The sorted array:\n" + Arrays.toString(array));
    }

    public static void sort(int[] array) {
        if (array.length < 2) {
            return;
        }

        int[] left = new int[array.length / 2];
        int[] right = new int[array.length - left.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = array[left.length + i];
        }

        sort(left);
        sort(right);
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        for (; i < left.length && j < right.length; k++) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
        }

        for (; i < left.length; k++, i++) {
            array[k] = left[i];
        }

        for (; j < right.length; k++, j++) {
            array[k] = right[j];
        }
    }
}
