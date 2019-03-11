import java.util.List;

public class MotorCycle extends Vehicle {

    
    @Override
    List<ParkingSpot> getParkingSpots() {
        List<ParkingSpot> spots = null;
        if (!ParkingLevels.parkingLevel.isEmpty()) {
            spots = (List<ParkingSpot>) ParkingLevels.parkingLevel.get(0);
        }
        else {
            System.out.println("Parking full..");
        }
        return spots;
    }

    @Override
    VehicleSize setSize() {
        
        return VehicleSize.MOTORCYCLE;
    }


}
