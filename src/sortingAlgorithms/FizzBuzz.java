package sortingAlgorithms;


// Using Short Circuit Operator's we should "evaluate" if  our "int" divisible by both 3 & 5?
//  is nums divisible by 3?
//  is nums divisible by 5?


class FizzBuzz {

    public static void main(String[] args) {

        int nums = 15;


        for (int i=1; i<=nums; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else
                System.out.println(i);
        }
    }






    /*
    */
/*1*//*
public static void main(String[] args) {
        int nums = 15;

*/
/*SCO Evaluation*//*

        for (int i=1; i<=nums; i++) {
            */
/*is divisible by both 3 & 5*//*

            if (i%5==0 && i%3==0) {
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }
    }
*/



    }







