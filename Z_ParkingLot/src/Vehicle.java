import java.util.ArrayList;
import java.util.List;


public abstract class Vehicle {
    
    ParkingLevels levels = new ParkingLevels();
    
    String numberPlate;
    
    VehicleSize size = setSize();
    
    abstract VehicleSize setSize();

    abstract List<ParkingSpot> getParkingSpots();
    
    ParkingSpot allotedSpot;
    

}
