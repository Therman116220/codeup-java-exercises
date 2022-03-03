package shapes;

public abstract class Square extends Quadrilateral {
public Square(int side) {
    super(side,side);
}





//Get-Set//


    public  double perimeter() {
        return (this.length * 2) + (this.width * 2);
    }
    public  double area() {
        return  this.length * this.width;
    }





}
