package ZoneManager;

import java.util.Arrays;

public class Zone {
    private int idZone;
    private int high;
    private  int width;
    private String[] location={"roof","1stFlor","2ndFlor","Stret"};
    private String locationZone;
    private double area;
    public Zone(){
        super();
    }
    public Zone (int idZone,int high,int width,int c){
        this.high=high;
        this.idZone=idZone;
        this.width=width;
        locationZone=location[c];
    }
public double getAreaZone(){
        area=high*width;
        return area;
}
public String getLocationZone(){
        return locationZone;
}

    @Override
    public String toString() {
        return "Zone{" +
                "idZone=" + idZone +
                ", high=" + high +
                ", width=" + width +
                ", locationZone='" + getLocationZone()+ '\'' +
                ", area=" +getAreaZone() +
                '}';
    }
}
