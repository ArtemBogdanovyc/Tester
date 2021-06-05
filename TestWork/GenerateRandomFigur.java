package TestWork;

import java.util.Random;

public class GenerateRandomFigur {
    private Random random;
    public GenerateRandomFigur(){
        random= new Random();


    }
    public Figure next(){
        switch ((int)(Math.random()*4)){
            case 0: return new Square( (int)(Math.random()*6) ,Math.round(random.nextDouble()*100000)/100.0);
            case 1: return  new Triangle((int)(Math.random()*6), Math.round(random.nextDouble()*10000)/100.0);
            case 2: return  new Circle((int)(Math.random()*6),Math.round(random.nextDouble()*10000)/100.0);
            case 3: return  new Trapece((int)(Math.random()*6),Math.round(random.nextDouble()*10000)/100.0,
                                    Math.round(random.nextDouble()*10000)/100.0,
                                   Math.round(random.nextDouble()*10000)/100.0);
        }
        return new Square();
    }
}
