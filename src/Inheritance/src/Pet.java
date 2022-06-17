import java.io.Console;

public class Pet {
    /*Properties*/

    /*Actions*/
    boolean barking = true;
    boolean needsToEat = true;
    boolean needsToDrink = true;
    boolean sleeping = false;


    /*Actions*/
    public boolean barking() {
        if (barking) {
            System.out.println("Bark Bark");

        } else {
            return false;
        }

        return false;
    }

    /*Eat*/
    public boolean needsToEat() {
        if (needsToEat) {
            System.out.println("I'm Hungry");
        } else {
            return false;
        }
        return false;
    }
    /*Drinks*/
    public boolean needsToDrink() {
        if (needsToDrink) {
            System.out.println("I'm Thirsty");
        }
        return false;
    }

    /*Sleep*/

    public  boolean Sleeping() {
        if (sleeping) {
            System.out.println("zzZZZ");
        } else {

        } return  false;
    }
    /*----------------------*/




    public Pet(boolean sleeping, boolean needsToDrink, boolean needsToEat, boolean barking) {
        this.sleeping = sleeping;
        this.needsToDrink = needsToDrink;
        this.needsToEat = needsToEat;
        this.barking = barking;
    }


}