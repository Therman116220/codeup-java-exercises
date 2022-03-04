// import javax.xml.namespace.QName;
import java.util.Scanner;

import java.util.Scanner;

public class Grades() {

    Scanner scan = Scanner(System.in);
  System.out.println("Enter your name: ");
   String inputName = scan.nextLine();
   System.out.println("Enter your Age: ");
    String inputAge = scan.nextLine();
    System.out.println("Enter your Grade: ");
    String inputGrade = scan.nextLine();
    System.out.println("Enter your Feeling: ");
    String inputFeelings = scan.nextLine();
    public static class Student {

        public static String name;

        // returns the student's name  || FOR LATER ❌
        // public String getName() {


        public static int grade;
        // returns the average of the students grades ❌
        // public double getGradeAverage ();

        public static int age;
        // returns the students age ❌
        // public int getAge ();

        public static int feeling;
        // returns the students feeling (Similar to the army stress card) ❌
        // public int feeling ();

       /* public Student(name, grade, age, feeling) {
            this.name = name;
            this.grade = grade;
            this.age = age;
            this.feeling = feeling;
        }*/


        //---------------------------------------------------------------------------------------------------------//


        public static void main(String[] args) {
            System.out.println("My name is " + Student.name);
            System.out.println("My grade is : " + Student.grade);
            System.out.println("My age is: " + Student.age);
            System.out.println("I'm feeling pretty " + Student.feeling);
        }



    }
}