import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLevels {

    static int levels = 3;
    static int spots = 3;
    static Map<Integer, List<ParkingSpot>> parkingLevel = new HashMap();

    ParkingLevels() {

    }

    static {
        int count = 0;
        for (int j = 0; j < levels; j++) {
            List<ParkingSpot> parkingSpot = new ArrayList();
            for (int i = 0; i < spots; i++) {
                ParkingSpot spot = new ParkingSpot();
                spot.setBlockId(++count);
                spot.setLevel(j+1);
                parkingSpot.add(spot);
            }
            parkingLevel.put(j, parkingSpot);
        }
    }
}
