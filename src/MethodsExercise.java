import java.util.Scanner;
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
            System.out.println("Thank You!");
            return;
        }
        System.out.println("Please Enter a number between 1 and 10");
        Scanner in = new Scanner(System.in);
        userInput = in.nextInt();
        getInteger(userInput, max);
    }
}
