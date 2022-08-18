package sortingAlgorithms;

import java.util.Random;

/*Complexity of 0(log n)
* Faster
* */
public class MergeSort {

    public static void main(String[] args) {
        Random random  = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length;i++) {

            numbers[i] = random.nextInt(10000);
        }

}

