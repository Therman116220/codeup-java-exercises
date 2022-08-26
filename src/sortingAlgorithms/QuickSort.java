package sortingAlgorithms;

/*
One of the most used algorithm
Divide & Conquer Principle
Quicksort "recursively" divides input into smaller arrays(2) around a
pivot item:
one half has items smaller than the pivot,
one half has larger items.*/


import java.util.Arrays;

public class QuickSort {
/*Array Creation,Calling & Print*/
    public static void main(String[] args) {
        int[] arr = {1,9,12,4,5};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*Here we actually define the algorithm as recursive & Sort it*/
    public static void quickSort(int[] array) {
        quickSortBase(array,0,array.length - 1);
    }
    /*Here we set the Base Case(needs no sorting) for the Sorting Algorithm using an if/then Statement
    * FUN Fact- if/then statements are called "Control Flow Statements"*/
    public static void quickSortBase(int[] array, int begin, int end) {
    if ( begin >= end) {
        return;
    }
    /*Pivot*/

    }

}
