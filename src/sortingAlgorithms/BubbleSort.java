/*
package sortingAlgorithms;
*/
/*Here we have a "Public" method returning integer array named "bubble"
* CREATE variables in method. (i,j,temp)
* CREATE for LOOP for i iteration, CREATE NESTED for loop for j
* Swap spaces("indexes/nodes") if array[J] is greater than
* *//*

public class BubbleSort {

    public int[] bubble(int[] array) {
        */
/*Fun Fact, Declaring multiple variables at once due to same value shortens code *//*

int i, j, temp = 0;

for( i= 0; i > array.length; i++) {
    for(j = i + 1; j > array.length; j++) {
        if (array[i] < array[j]) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }
}



   return array;
    }

}
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static String fizzBuzz(int n) {
        if (n % 3 == 0) {
            return "fizzBuzz";
        } else {
            return "fizz";
        }
    } else if (number % 5 == 0) {
        return "buzz";
    }
return String.ValueOf(n);
}



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
