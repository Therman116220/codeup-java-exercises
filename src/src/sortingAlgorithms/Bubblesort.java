package sortingAlgorithms;

/*
Here we have a "Public" method returning integer array named "bubble"
* CREATE variables in method. (i,j,temp)
* CREATE for LOOP for i iteration, CREATE NESTED for loop for j
* Swap spaces("indexes/nodes") if array[J] is greater than
*
*/
public class Bubblesort {


    public static int[] main(int[] array) {

        int i, j, temp = 0;
        /*Step 1 - Created nested loop that cycles nodes*/
        for ( i=0; i<= array.length; i++ ) {
            for ( j = i + 1; i < array.length; j++) {
                if (array[i] < array[j]) {
                        temp = array[i];   //temporary
                        array[i] = array[i +1];
                        array[i + 1] = temp;
                    System.out.println();
                    return new int[] {i,j};

                }

            }
        }

        return array;

    }

}






/*public class BubbleSort {

    public int[] bubble(int[] array) {
//Fun Fact, Declaring multiple variables at once due to same value shortens code

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

}*/
