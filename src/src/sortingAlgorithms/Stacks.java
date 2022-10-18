package sortingAlgorithms;
import java.util.Stack;

//FILO
public class Stacks {


    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();

        nums.add(5);
        nums.add(9);
        nums.add(10);
        nums.add(11);
        System.out.println(nums.peek());  //11
        nums.pop(); //10
        System.out.println(nums.peek());
        nums.pop();//9
        System.out.println(nums.peek());
        nums.pop();//5
        System.out.println(nums.peek());
        nums.pop();
        System.out.println(nums.empty());//true


    }
 /*   public static void main(String[] args) {

        Stack<String> movie = new Stack<>(); //replaced Stack<String> w/ <> for simplicity
        movie.add("Avatar");
        movie.add("The Internship");
        movie.add("Where The RedFern Grows");
        System.out.println("Empty: " + movie.empty());
        System.out.println("Peaked: "+ movie.peek());
        System.out.println("Popped: "+ movie.pop());
        System.out.println("Popped: "+ movie.pop());
        System.out.println("Popped: "+ movie.pop());
        System.out.println("Empty: "+movie.empty());
    }*/
}
