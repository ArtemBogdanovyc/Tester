package ZoneManager;

import java.util.Scanner;

public class ZoneCreator {
    private  Scanner sc;
       private String zoneType;
       public ZoneCreator(){
           sc= new Scanner(System.in);

    }
    public Zone zoneCreate(){

        System.out.println("You want create new zone or use default?(new/default)");
         zoneType=sc.next();
           switch (zoneType){
            case ("new"): System.out.println("Enter please parameters of zone!");

            return new Zone(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            case ("default"):System.out.println("Generate default Zone");

            return new Zone(10,2,4,3);

        }
        return new Zone();
    }
}
