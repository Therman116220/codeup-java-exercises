package shapes;


/*
import java.awt.*;
*/

public abstract class Quadrilateral extends shape implements measurable {

    protected int length;
    protected int width;
}


public Quadrilateral(int length, int width) {
    this.width =width;
    this.length =length;
}

  public int grabLength() {
return length;
return width;
  }

  public static void main(String[] args) {
        Measureable myShape = new rectangle();
    }
}
public abstract void setWidth(int width) {
      return  this.width = width;
        }

public abstract void setLength(int length) {
    return this.length = length;
        }