// import javax.xml.namespace.QName;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println("My name is " + Student.name);
        System.out.println("My grade is : " + Student.grade);
        System.out.println("My age is: " + Student.age);
        System.out.println("I'm feeling pretty " + Student.feeling);


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String inputName = scan.nextLine();
        System.out.println("Enter your age please: ");
        String inputAge = scan.nextLine();
        System.out.println("Enter your Grade: ");
        String inputGrade = scan.nextLine();
        System.out.println("Enter your Feelings on the course: ");
        String inputFeelings = scan.nextLine();


        Student Prada = new Student("Prada", 92, 24, "saucy");
        Student James = new Student("James", 45, 12, "cool");


    }




    public static class Student  {

        public static String name;

        // returns the student's name  || FOR LATER ❌
        // public String getName() {


        public static int grade;
        // returns the average of the students grades ❌
        // public double getGradeAverage ();

        public static int age;
        // returns the students age ❌
        // public int getAge ();

        public static String feeling;
        // returns the students feeling ❌
        // public int feeling ();

        public Student( String name, int grade, int age, String feeling) {
            this.name = name;
            this.grade = grade;
            this.age = age;
            this.feeling = feeling;
        }


        //---------------------------------------------------------------------------------------------------------//


        }









    }
