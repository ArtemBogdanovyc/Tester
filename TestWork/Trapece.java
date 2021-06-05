package TestWork;

import java.util.Arrays;

public class Trapece extends Figure{
    private double high;
       private double sideTrapeceB;
    private double sideTrapeceC;
    private double area;
    public Trapece(int c ,double a,double sideTrapeceB,double sideTrapeceC){
        super(c, a);

        this.sideTrapeceB=sideTrapeceB;
        this.sideTrapeceC=sideTrapeceC;
    }
public double getHigh(){
        high=Math.sqrt(sideTrapeceB*sideTrapeceB-((sideTrapeceC-side)/2)*((sideTrapeceC-side)/2));
        return high;
}
    public double getArea() {
        area=high*Math.sqrt(side*sideTrapeceB);
        return area;
    }

    public double getSideTrapeceB(){
        return sideTrapeceB;
    }
    public double getSideTrapeceC(){
        return sideTrapeceC;
    }

    @Override
    public String toString() {
        return "Trapece{" +
                "color=" + getColor() +
                ", side=" + side +
                ", high=" + getHigh()+
                ", sideTrapeceB=" + getSideTrapeceB()+
                ", sideTrapeceC=" + getSideTrapeceC() +
                ", area=" + getArea() +
                '}';
    }
}
