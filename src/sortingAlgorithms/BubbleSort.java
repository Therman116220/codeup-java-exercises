package sortingAlgorithms;
/*
Here we have a "Public" method returning integer array named "bubble"
* CREATE variables in method. (i,j,temp)
* CREATE for LOOP for i iteration, CREATE NESTED for loop for j
* Swap spaces("indexes/nodes") if array[J] is greater than
*
*/





public class BubbleSort {

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

}
