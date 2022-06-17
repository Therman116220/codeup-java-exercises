public class Pen {
    public static void main(String[] args) {
        System.out.println("Test");


        Pen favoritePen = new Pen();

        System.out.println(favoritePen.color);
        System.out.println(favoritePen.point);
        System.out.println(favoritePen.type);
        System.out.println(favoritePen.clicked);

    }


    /*Properties*/
    String type = "gel";
    String color = "blue";
    int point = 10;

    /*Actions*/
    static boolean clicked = false;
    static boolean Unclicked = true;

    public static void Click() {
        clicked = true;
    }

    public static void UnClick() {
        Unclicked = true;
    }






}  /*Class End*/

