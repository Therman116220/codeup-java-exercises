import java.sql.SQLOutput;
import java.util.Scanner;
public class  ConsoleExercises {

    public static void main(String[] args) {



      /*  String name = "codeup";
        System.out.printf("Hello there, %s. Nice to see you. %n", name);

    }*/


//1
       /* double pi = 3.14159;
        String x = "strings";
        System.out.format("The value of pi is %.4s%n", x);

        Scanner in = new Scanner(System.in);
        int integer;
        System.out.println("Enter a integer");
        integer = in.nextInt();
      System.out.println("Here is what you entered:" + integer);
        }}*/
//2
//display on new line
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter three words: ");
       String string1 = scan.nextLine();
       String string2 = scan.nextLine();
       String string3 = scan.nextLine();

       System.out.println(string1);
       System.out.println(string2);
       System.out.println(string3);
       System.out.printf("%s,%s,%s", string1, string2, string3);

//3


       Scanner sc = new Scanner(System.in);
       System.out.println("Enter sentence here: ");
       String sentence = sc.next();
       System.out.println("You entered: " + sentence);



       Scanner scanRoom = new Scanner(System.in);


//4



       Scanner scan2 = new Scanner(System.in);
       System.out.println("Enter sentence here: ");
       String sentence = sc.nextLine();
       System.out.println("You entered: " + sentence);







//1

       Scanner scanRoom = new Scanner(System.in);
       System.out.println("Enter the length and width of the Class?");
       int length = scanRoom.nextInt();
       int width = scanRoom.nextInt();
       System.out.println((length * 2) + (width * 2));






    }
}