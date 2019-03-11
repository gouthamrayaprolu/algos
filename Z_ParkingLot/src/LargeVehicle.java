import java.util.List;

public class LargeVehicle extends Vehicle {

    @Override
    List<ParkingSpot> getParkingSpots() {

        List<ParkingSpot> spots = (List<ParkingSpot>) ParkingLevels.parkingLevel.get(2);
        
        return spots;
    }

    @Override
    VehicleSize setSize() {
        
        return VehicleSize.LARGE;
    }

}
