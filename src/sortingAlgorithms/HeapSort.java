package sortingAlgorithms;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HeapSort {


    abstract class Food {

        double proteins;
        double fats;
        double carbs;
        double tastyScore;


        abstract void  getMacroNutrients {


        }


        class Egg extends Food {
            int tastycore= 7;
            String type = "non-vegetarian";
            public Egg(double proteins, double fats, double carbs) {
                System.out.println("An eff has " + this.proteins + "gms of fats and " + this.carbs + "gms of carbohydrates");
            }
        }

        class Bread extends Food {
            int tastycore= 8;
            String type = "non-vegetarian";
            public Bread(double proteins, double fats, double carbs) {
                System.out.println("Bread has " + this.proteins + "gms of fats and " + this.carbs + "gms of carbohydrates");
            }
        }



    }
}
