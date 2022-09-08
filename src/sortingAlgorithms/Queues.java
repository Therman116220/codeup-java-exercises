package sortingAlgorithms;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    /*1*/
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();

        q.add("Credit Card 1");
        q.add("Credit Card 2");
        q.add("Credit Card 3");

        q.peek();
        System.out.println(q.size());
        System.out.println(q.contains("2"));
        System.out.println(q.contains("4"));
       /*Print to an array*/
        System.out.println(q.toArray()[1]); //Grabbing
    }
}
