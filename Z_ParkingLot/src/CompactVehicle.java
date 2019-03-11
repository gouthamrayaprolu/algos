import java.util.List;


public class CompactVehicle extends Vehicle {

    @Override
    List<ParkingSpot> getParkingSpots() {
        
        List<ParkingSpot> spots = null;
        if (!ParkingLevels.parkingLevel.get(1).isEmpty()) {
            spots = (List<ParkingSpot>) ParkingLevels.parkingLevel.get(1);
        }
        else {
            System.out.println("Parking full..");
        }
        return spots;
    }

    @Override
    VehicleSize setSize() {
        
        return VehicleSize.COMPACT;
    }

}
