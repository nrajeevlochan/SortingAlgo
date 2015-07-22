package com.algo.sorting;

import java.util.Arrays;

public class SortingMainClass {

    public static void main(String[] args) {
        System.out.println("****** Sorting Algo ******");
        int[] intArray = Utils.randomNumberGenerator(50, 100);
        System.out.println("Print out int array: " + Arrays.toString(intArray));
        Sorting sortArray = new bubbleSort();
        System.out.println("Sorted int array list: " + Arrays.toString(sortArray.sort(intArray)));
    }
}
