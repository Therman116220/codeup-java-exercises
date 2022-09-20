package sortingAlgorithms;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

    Queue<String> names = new LinkedList<>();


       /*1*/names.add("Shelly");
       /*2*/names.add("Thompson");
       /*3*/names.add("Mikey");
       /*4*/names.add("Heller");
       /*5*/names.add("Felt");
       /*6*/names.add("Ibanez");
       /*7*/names.add("Jeff");
       /*8*/names.add("Krystal");
       /*9*/names.add("Westley");
      /*10*/names.add("Marley");


    System.out.println(names.contains("Marley")); // True, there is a item in-queue named Marley
        /*    names.removeIf(names[0]===names[1]);*/
        names.size();
        names.remove(args[0]);





        /*1*/
      /*  Queue<Integer> nums = new LinkedList<>();


        nums.add(7);
        nums.add(4);
        nums.add(12);
        nums.add(74);

        System.out.println(nums.size());
        System.out.println(nums.peek());
        System.out.println(nums.poll());
        System.out.println(nums.contains(7));
*/




        /* Queue<String> dogWalker = new LinkedList<String>();
   dogWalker.add("Zeus");
   dogWalker.add("Spot");
   dogWalker.add("Milly");
   dogWalker.add("Slate");
   dogWalker.add("Elli");
        *//*How many dogs I have to walk*//*   //5
        System.out.println(dogWalker.size());
        *//*Is your pet still here? Name Look-up   *//*
        System.out.println(dogWalker.contains("Spot"));

        *//*Find by position in queue*//*
        // 1st on queue
        System.out.println(dogWalker.toArray()[0]);
        //Last in queue*/






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
