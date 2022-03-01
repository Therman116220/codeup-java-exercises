
import java.util.Arrays;
public class ArraysExercises {

      static int[][] matrix = {
              {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}
      };

for (int[] row : matrix)


      {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                  System.out.print(n + " | ");
            }

            System.out.println();
      }

      public static void main(String[] args) {

            System.out.println(matrix[1][0]); // 4
// the last element in the first row
            System.out.println(matrix[0][2]); // 3
// the first element in the last row
            System.out.println(matrix[2][0]); // 7

            System.out.println("+---+---+---+");

}




//-------------------------------------------------------------------------




      static int[] numbers = {1, 2, 3, 4, 5};
//    static String[] persons = new String[3];








//   content here
}