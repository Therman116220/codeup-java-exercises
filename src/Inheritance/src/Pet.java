public class Pet {
    /*Properties*/
    String name;
    String color;
    String size;
    int age;
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

    public void Sleeping() {
        if (sleeping) {
            System.out.println("zzZZZ");
        } else {

        }
    }
    /*----------------------*/

    //Properties
    public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet(boolean sleeping, boolean needsToDrink, boolean needsToEat, boolean barking) {
        this.sleeping = sleeping;
        this.needsToDrink = needsToDrink;
        this.needsToEat = needsToEat;
        this.barking = barking;
    }

    public static void main(String[] args) {
        Pet myDogDez = new Pet(true, false, false, false);
        Pet myCatAsh = new Pet(false,false,true,false);
    }

}