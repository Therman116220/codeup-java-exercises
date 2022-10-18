package practiceWithAlgorithms;
//Today I want to practice sets in a ways that are realistic in implementation.
// A stretch goal is to notate the time complexity.

    //Self-reminder a SET must search the entire array (N) prior to shifting the arrays memory allocation (N) then adds a node. (+1)giving it an N + 1
    //

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;




public class Sets {

    public static void main(String[] args) {
        String[] groceryList = {"Rice","Milk", "Bread", "GroundBeef", "Potatoes", "Beans"};

        Set<String> set= ArrayToSet(groceryList);

    }
    public static <T> Set<T> ArrayToSet(T[] groceryList) {
        /*Empty Set*/
        Set<T> set1 = new HashSet<>();

        /*Empty Set*/
        Set<T> set2 = new HashSet<>();

        /*Iteration*/
        for (T element : groceryList) {
            set1.add(element);
            set2.add(element);
        }

        /*return set1;*/
        return set2;



    }
















}
