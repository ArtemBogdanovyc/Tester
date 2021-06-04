package TestWork;

import java.util.Random;

public abstract class Figure {
       protected String [] color={"orange","blue","white","black","red","yellow"};
        protected double side;
        private String colorFigure;
        public Figure(){
            colorFigure=color[0];
            side=1.0;
    }
    public Figure(int c , double a){
            colorFigure=color[c];
            side=a;

    }


    public String getColor(){
            return colorFigure;
    }
    public void draw() {
        System.out.println(this);
    }
public String toString(){
    return  "Figure:"+this.getClass().getSimpleName()+ "color:"+ color;
        }


}
