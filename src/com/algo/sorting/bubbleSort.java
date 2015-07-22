package com.algo.sorting;

public class bubbleSort implements Sorting {

    bubbleSort() { }

    public int[] sort(int[] array) {
        for(int i=array.length-1;i>0;i--) {
            for(int j=0;j<i;j++) {
                if (array[j] > array[j+1]) {
                    Utils.swapVal(array, j, j+1);
                }
            }
        }
        return array;
    }

    public String[] sort(String[] array) {
        return null;
    }
}
