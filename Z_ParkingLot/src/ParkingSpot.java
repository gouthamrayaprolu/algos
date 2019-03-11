import java.sql.Timestamp;
import java.util.Date;


public class ParkingSpot {

     boolean isFree;
     int blockId;
     int level;
     Timestamp entry;
     Timestamp exit;
     
     public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean isFree) {
        this.isFree = isFree;
    }

    ParkingSpot(){
         this.isFree = true;
     }

}
