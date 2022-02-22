import java.util.Scanner;

public class ControlFlowExercise {

    public static void main(String[] args) {
        //1✅
     /*   // int i = 5;
        while (i <= 15) {
            i++;
        }
        ;*/

//b✅
        //Part one
        /* int count = 0;*/


   /* do {
        System.out.println("Count: " + count);
      count+= 2;
    } while (count<=100);*/
//Part Two✅
/*        int count = 100;
        do {
            System.out.println("Count: " + count);
            count-= 5;
        } while (count>=0);*/


//Part Three✅

/*        double counter = 2;
        do {
            System.out.println("Count: " + counter);
            counter = counter * counter;
        } while (counter<=1000000);

        */
//C

        for (int count = 100; count >= 0; count -= 5) {
            System.out.println("Count: " + count);
        }
        //C Part Two


        for (double counter = 2; counter >= 100; ) {
            System.out.println("Count: " + counter);
        }


//2

     /*   for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");

            } else {
                System.out.println(i);
            }
        }*/

        //3
/*
        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter an Integer: ");
            int integerNext = scanner.nextInt(6);
            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
            System.out.println("------" + "  " + "------" + "  " + "------");
            for (int i = 1; i <= integerNext; i++) {
                int numberSquared = (int) Math.pow(i, 2);
                int numberCubed = (int) Math.pow(i, 3);
                String message = "\n" + "|  " + i + "   |  " + numberSquared + "     |  " + numberCubed;
                System.out.print(message);
            }
            System.out.print("\nContinue? (y/n): ");
            choice = scanner.next();
            System.out.println();


        }*/



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerical grade: ");
        int userInput = scanner.nextInt(); // input as int
        if(userInput >= 90 & userInput <= 100)
        {
            System.out.println("You scored a: " + userInput + ", you got an A");
        }
        else if (userInput >= 80 & userInput <= 89)
        {
            System.out.println("You scored a: " + userInput + ", you got a B");
        }
        else if (userInput >= 70 & userInput <= 79)
        {
            System.out.println("You scored a: " + userInput + ", you got a C");
        }
        else if (userInput >= 60 & userInput <= 69)
        {
            System.out.println("You scored a: " + userInput + ", you got a D");
        }
        else {
            System.out.println("You scored a: " + userInput + " ...how do you feel about us setting up time to study😁");
        }

    }
}
