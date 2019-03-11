
public class App {

    static ParkingLevels levels;
    
    public static void main(String[] args) {
    
        Vehicle v1 = new MotorCycle();
        Vehicle v2 = new MotorCycle();
        Vehicle v3 = new MotorCycle();
        Vehicle v4 = new MotorCycle();
        Vehicle v5 = new MotorCycle();
        Vehicle v6 = new MotorCycle();
        Vehicle v7 = new MotorCycle();
        Vehicle v8 = new MotorCycle();
        
        Vehicle v9 = new LargeVehicle();
        Vehicle v10 = new LargeVehicle();
        
        Vehicle v11 = new CompactVehicle();
        
        ParkingManager m = new ParkingManager();
    
        m.park(v1);
        m.park(v2);
        m.park(v3);
        m.park(v4);
        m.park(v5);
        m.park(v6);
        m.park(v7);
        m.park(v8);
        m.unPark(v3);
        m.park(v9);
        m.park(v8);
        m.park(v11);
        m.unPark(v9);
        m.park(v10);
    }

}
