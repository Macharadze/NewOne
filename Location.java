import java.util.HashMap;
import java.util.Map;

public class Location {
    public  final int locationID;
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits=new HashMap<String,Integer>();
        this.exits.put("Q",0);
    }


    public void addExit(String dir,int loc){
        exits.put(dir,loc);
    }
    public int locationID() {
        return locationID;
    }

    public String description() {
        return description;
    }

    public Map<String, Integer> exits() {
        return new HashMap<String,Integer>(exits);
    }
}
