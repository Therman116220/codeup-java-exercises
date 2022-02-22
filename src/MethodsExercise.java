import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class MethodsExercise {


    //1
    public static int addition(int x, int y) {
        return (x + y);


    }


    //2
    public static int subtraction(int x, int y) {
        return (x - y);


    }

    //3
    public static int multiply(int x, int y) {
        return (x * y);


    }

    //4
    public static int divide(int x, int y) {
        return (x / y);


    }

    //1D
    public static int modulus(int x, int y) {
        return (x % y);


    }


    //CALLBACKS//
    public static void main(String[] args) {
        addition(10, 10);
        subtraction(5, 5);
        multiply(2, 2);
        divide(100, 50);

        modulus(13, 11);

    }


//2

    public static void getInteger(int userInput, int max) {
        if (userInput < max) {
            System.out.println("Thank You!!");
            return;

        }
        ;
//3*/
    /*    System.out.println("Enter a number between 1 and 10");
        Scanner in = new Scanner(System.in);int i;
        userInput = in.nextInt();
        getInteger(userInput, max);
          while( userInput > i) {
            return userInput * i;
        }
    }
}*/


//4


       /* while(true)*/
        Scanner scanner = new Scanner(System.in);
        String choice = "y";

        while (true) {
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            int sum1 = dice1 + dice2;
            int dice3 = (int) (Math.random() * 6 + 1);
            int dice4 = (int) (Math.random() * 6 + 1);
            int sum2 = dice3 + dice4;
            System.out.println("Roll: total = " + sum1);
            System.out.println("Roll: total = " + sum2);

            if (sum1 < sum2) {
                System.out.println( "You rolled" + sum1 + "Computer rolled: " + sum2 + " huh, better luck next time old sport");
                break;
            } else if ( sum1 > sum2) {
                System.out.println("You rolled" + sum1 + "Computer rolled: " + sum2 + "! Lucky one, huh?");
                break;
            } else {
                System.out.println("You tied!!");
            }
            System.out.print("\nContinue? (y/n): ");
            choice = scanner.next();
            System.out.println(choice);
        }

//5


            Scanner scan = new Scanner(System.in);
            int count = 0;
            int a = 1 + (int) (Math.random() * 99);
            int guess = 0;

            System.out.println("I am thinking of a number from 1 to 100"
                    + " Try to guess what it might be!?");

            while (guess != a) {
                guess = scan.nextInt();
                count++;
                if (guess > a) {
                    System.out.println("lower!");
                } else if (guess < a) {
                    System.out.println("higher!");
                }
            }
            System.out.println("Congratulations. You guessed it in "
                    + count + " attempts");
        }



    }
