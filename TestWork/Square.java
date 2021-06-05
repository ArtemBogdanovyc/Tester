package TestWork;

import java.util.Arrays;

public class Square extends Figure{
  private double area;
  public Square(){
      super();
  }

 public Square(int c, double a){

        super(c, a);
 }

    public double getArea() {
        area=side*side;
        return area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color=" + getColor() +
                ", side=" + side +
                ", area=" + getArea() +
                '}';
    }
}
