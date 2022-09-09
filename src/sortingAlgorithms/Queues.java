package sortingAlgorithms;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    /*1*/
    public static void main(String[] args) {



   Queue<String> dogWalker = new LinkedList<String>();
   dogWalker.add("Zeus");
   dogWalker.add("Spot");
   dogWalker.add("Milly");
   dogWalker.add("Slate");
   dogWalker.add("Elli");
        /*How many dogs I have to walk*/   //5
        System.out.println(dogWalker.size());
        /*Is your pet still here? Name Look-up   */
        System.out.println(dogWalker.contains("Spot"));

        /*Find by position in queue*/
        // 1st on queue
        System.out.println(dogWalker.toArray()[0]);
        //Last in queue






        /*1*/
     /*   Queue<String> q = new LinkedList<String>();

        q.add("Credit Card One");
        q.add("Credit Card Two");
        q.add("Credit Card Three");


        System.out.println(q.size()); //Size of Queue - 3
        System.out.println(q.contains("Credit Card Two")); //True
        System.out.println(q.contains("4")); // False
       *//*Print to an array*//*
        System.out.println(q.toArray()[0]); //Grabbing Credit Card 2
        System.out.println(q.toArray()[2]);
        System.out.println(q.toArray()[1]);
        *//*q.peek();*/
    }
}
