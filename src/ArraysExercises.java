import java.util.Arrays;
public class ArraysExercises {



    //1


   /* int[] numbers = {1, 2, 3, 4, 5};*/
/*System.out.println(numbers);*/


    public static void main(String[] args) {


//SYNTAX

        int[] texasTemps = new int[3];
        // int[] - data type of the variable
        //texasTemps - var name
        // new int[3] - initializeing new array of integers
        //[3] - length of hte array being created
        // [][][] --> length
        // 0 1 2 --> index

        // assign some values to those slots
        texasTemps[0]=36;
        texasTemps[1]=45;
        texasTemps[2]=86;


        System.out.println(texasTemps[1]);  // print out the value of the elemens in the first index // 45


        // 1. declare data type String
        // 2. save it to variable
        // 3. create a array
        // // the value is the dataType `arra
        // 4. specify the data type og the array
        // 5. define the length of the array
        // 6. assign values to each of the elements in the array

        String[] weatherType = new String[20];
        // weatherType = [[],[],[]]
        weatherType[0] = "snowy";
        weatherType[2] = "sunny";
        weatherType[3] = "rainy";
        // [["snowy"], ["sunny"], ["rainy"]];


        System.out.println(weatherType);


        // //HANDLING MULTIPLE ELEMENTS AT A TIME
        // create an array that holds my daily steps
        //data type of elements? long //data type - array
        // name the variable that holds the array - dailySTEPS
        //data type of the variable (dailySteps) ? long_

        long[] dailySteps = {10000, 12000, 20000};
        System.out.println(dailySteps[0]);
        System.out.println(dailySteps[2]);
        System.out.println(dailySteps[3]);
        // [[10,000],[12,000],[20,000]]





    }
}