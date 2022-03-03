package shapes;

import java.awt.*;

public class rectangle extends Quadrilateral {
    public double length;
    public double width;

  /*  public rectangle(double sidesOfRectangle, int i) {
    }*/

    public double rectangle(double sides) {
        this.length = length;
        this.width = width;


        System.out.println(length);
        System.out.println(width);
        return length;
        
    }








    public  double perimeter() {
        return (this.length * 2) + (this.width * 2);
    }
    public  double area() {
        return  this.length * this.width;
    }



    public static void main(String[] args) {

       //Argument//
        rectangle one = new rectangle();
/*        rectangle two = new rectangle(2,4);
        rectangle three = new rectangle(2,4);
        rectangle four = new rectangle(2,4);*/
        System.out.println(one);
    }







}






