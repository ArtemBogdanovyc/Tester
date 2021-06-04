package TestWork;

import java.util.Arrays;

public class Circle extends Figure{
    private double area;


public  Circle(int c, double a){
    super(c,a);
}


    public double getArea() {
    area=Math.PI*(side*side);
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + getArea() +
                ", color=" + getColor() +
                ", side=" + side +
                '}';
    }
}
