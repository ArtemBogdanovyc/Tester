package TestWork;

import java.util.ArrayList;
import java.util.List;

public class CollectionOfFigurs {
    private List<Figure>colect;
    private int quantity;
    private GenerateRandomFigur grf;
    public CollectionOfFigurs(){
        grf= new GenerateRandomFigur();
        colect=new ArrayList<>();
        quantity=10;
    }

    public List<Figure> getColect() {
        for(int i=0;i<quantity;i++){
            colect.add(grf.next());
        }
  return colect;
    }
}
