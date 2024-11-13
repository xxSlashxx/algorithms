package de.slash.algorithms.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayGenerator {

    private ArrayGenerator() {
    }

    public static int[] generateArray() {
        int arraySize = requestArraySize();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        return array;
    }

    private static int requestArraySize() {
        System.out.println("Choose the number of elements to sort [1-99]:");
        Scanner scanner = new Scanner(System.in);
        int arraySize;

        do {
            try {
                arraySize = scanner.nextInt();

                if (arraySize < 1 || arraySize > 99) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException ex) {
                arraySize = 0;
                System.out.println("The input is invalid. Only numeric values from 1-99 are allowed.");
            }
        } while (arraySize == 0);

        return arraySize;
    }
}
