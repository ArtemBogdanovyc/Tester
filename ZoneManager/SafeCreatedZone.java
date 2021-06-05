package ZoneManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SafeCreatedZone {
    private List<Zone> createdZones;
    private Scanner sc;
    private int n ;
    private int standardZones;
    private ZoneCreator zc;

    public SafeCreatedZone(){
        createdZones= new ArrayList<>();
        sc= new Scanner(System.in);
        zc= new ZoneCreator();
    }
    public List<Zone> savingZones(){
        System.out.println("enter please how many Zones ypu want create or enter (0/1)");
        standardZones=sc.nextInt();
        if(standardZones==1){
            n=10;
        }else if(standardZones==0){
            n=sc.nextInt();
        }
        for (int i=0; i<n;i++){
            createdZones.add(zc.zoneCreate());
        }
        return createdZones;
    }
}
