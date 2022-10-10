package sortingAlgorithms;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// Questions&Notes
//What are some use cases or real world applications?
//        *Heap Sort
//Used for finding min & max fast.
//What is a priority queue? How to use it as a heap?
//        * PriorityQueue<Integer> minHeap = new PriorityQueue<>();

//Using a array instead of LNode,RNode
//Steps:
//class,variables
//initialize heap w/ size.
//Create:
//insertion CFS- If not in right spot,compare with parent & Heapify UP/Down in level.
//nextEmpty
//Heapify UP/Down
//printHeap -print ALL elements in heap
public class Heaps {

    public static void main(String[] args) {
        Heaps maxHeap = new Heaps(10);
        maxHeap.insert();
    }
public static int data = 2;
public int[] heap;
public int defaultSize;

//init with size
public Heaps(int scope) {
    defaultSize = 0;
    heap = new int[scope + 1];
    Arrays.fill(heap, -1);












}

}
