package sortingAlgorithms;

import java.util.ArrayList;
import java.util.Stack;

//Notes:
    //*
    //*
    //*
public class ArrayLists {
    public static void main(String[] args) {

        String[] enterNameHere = new String[8];
        String[] bonusNameCollection = {"fail","quit","When","you"};


        System.out.print(bonusNameCollection[2]);
        System.out.print(bonusNameCollection[3]);
        System.out.print(bonusNameCollection[1]);
        System.out.print(bonusNameCollection[3]);
        System.out.print(bonusNameCollection[0]);

        /*Let's do this more in an arraylist*/
       ArrayList<String> makeItAList = new ArrayList<String>();

       /*Adding array items to arraylist*/

        for(int i = 0; i < args.length;i++)
            makeItAList.add(new String(args[i]));

        System.out.println(makeItAList);
    }

}
