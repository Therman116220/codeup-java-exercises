package sortingAlgorithms;



//  is divisible by both 3 & 5?
//  is divisible by 3?
//  is divisible by 5?


class FizzBuzz {

    /*3*/public static void main(String[] args) {
        int nums = 15;


        for (int i=1; i<=nums; i++) {
            /*is divisible by both 3 & 5*/
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



    }







