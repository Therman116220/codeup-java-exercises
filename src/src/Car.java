public class Car {
    public static void main(String[] args) {
        Car c = new Car();
        /*Properties*/
        System.out.println("Car One");
        System.out.println(c.color);
        System.out.println(c.type);

        System.out.println(c.year);
        System.out.println(c.make);
        System.out.println(c.model);
        System.out.println(c.Drive);

        /*Actions*/
    }

    /*Properties*/
    String type = "Type N/A";
    String color = "Color N/A";

    int year = 0;
    String make = "Make N/A";
    String model = "Model N/A";
    /*Actions*/

    static boolean Drive = true;
    static boolean RadioFunctional = true;
    static boolean Powerwindows = true;
    static boolean FourWD = false;


    public static void Drive() {
        Drive = false;
    }


    /*CLASS END*/
}