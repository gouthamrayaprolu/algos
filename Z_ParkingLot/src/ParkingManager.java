import java.util.List;


public class ParkingManager {

    ParkingSpot park(Vehicle vehicle) {
        List<ParkingSpot> spots = vehicle.getParkingSpots();
        for (ParkingSpot spot : spots) {
            if (spot.isFree()) {
                spot.setFree(false);
                vehicle.allotedSpot = spot;
                System.out.println("Parking alloted. Level: "+spot.getLevel()+" Spot: " +spot.getBlockId()
                        +" Vehicle: "+vehicle.size);
                return spot;
            }
        }
        System.out.println("Parking full..");
        return null;
    }
    
    ParkingSpot unPark(Vehicle vehicle){
        ParkingSpot spot = vehicle.allotedSpot;
        if(spot!=null){
            spot.setFree(true);
            System.out.println("Level: "+spot.getLevel()+" Spot:"+spot.getBlockId()+" is free now.");
            return spot;
           
        }
        else{
            System.out.println("Wrong entry..");
            return null;
        }
    }
}
