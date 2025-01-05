package de.slash.sort;

import de.slash.algorithms.sort.Bubblesort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubblesortTest {

    @Test
    void sort() {
        int[] arrayToSort = new int[]{5, 1, 2, 8, 4, 9, 3, 6, 7, 0, -1};
        Bubblesort.sort(arrayToSort);
        Assertions.assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, arrayToSort);
    }
}
