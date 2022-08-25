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

    public static void main(String[] args) {
        int[] arr = {1,9,12,4,5};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
