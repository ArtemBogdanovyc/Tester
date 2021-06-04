package TestWork;

import java.util.Arrays;

public class Triangle extends Figure{
   private double gipot;
   private double area;

    public  Triangle(int c ,double a){
        super(c, a);
    }

    public double getGipot() {
        gipot=Math.round(Math.sqrt(side*4)*100/100.0);
        return gipot;
    }
    public double getArea(){
        area=(Math.sqrt(3)/4)*side*side;
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + getColor()+
                ", side=" + side +
                ", gipot=" + getGipot() +
                ", area=" + getArea() +
                '}';
    }
}
