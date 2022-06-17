import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StringExercise {

    public class Marker {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(13);
            numbers.add(8);
            numbers.add(3); // Line 8
            for (Integer number: numbers) System.out.println(number);
        }
    }
}
