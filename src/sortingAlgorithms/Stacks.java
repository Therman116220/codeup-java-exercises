package sortingAlgorithms;
import java.util.Stack;


public class Stacks {
    public static void main(String[] args) {

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
    }
}
