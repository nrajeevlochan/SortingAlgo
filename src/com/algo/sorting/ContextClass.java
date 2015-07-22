package com.algo.sorting;

public class ContextClass {

    private Sorting sortAlgo;

    ContextClass() {
    }

    public void setSortAlgoithm(Sorting sort) {
        sortAlgo = sort;
    }

    public int[] sort(int[] array) {
        return sortAlgo.sort(array);
    }

}
