package com.algo.sorting;

import java.util.Random;

public class Utils {
    public static void swapVal(int[] array, int firstVal, int secVal) {
        int temp = array[firstVal];
        array[firstVal] = array[secVal];
        array[secVal] = temp;
    }

    public static int[] randomNumberGenerator(int arrayCapacity, int randNumRange) {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        int[] array = new int[arrayCapacity];
        for(int i=0; i<arrayCapacity;i++) {
            array[i] = rand.nextInt(randNumRange);
        }
        return array;
    }
}
