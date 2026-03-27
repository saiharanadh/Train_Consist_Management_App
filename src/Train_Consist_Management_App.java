import java.util.HashMap;
import java.util.Map;

public class Train_Consist_Management_App {
    public static void main(String [] args) {
        System.out.println("===========================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("===========================");

        Map<String, Integer> capacityMap = new HashMap<>();

        capacityMap.put("First Class",24);
        capacityMap.put("Cargo",120);
        capacityMap.put("Sleeper",72);
        capacityMap.put("AC Chair",56);
        for(Map.Entry<String,Integer> Map :capacityMap.entrySet()){

        }
    }
}