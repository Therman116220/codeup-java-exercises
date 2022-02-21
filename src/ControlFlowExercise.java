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
//Part Two
        int count = 100;
        do {
            System.out.println("Count: " + count);
            count-= 5;
        } while (count>=0);


//Part Three

        double counter = 2;
        do {
            System.out.println("Count: " + counter);
            counter = counter * counter;
        } while (counter<=1000000);















    }
}
