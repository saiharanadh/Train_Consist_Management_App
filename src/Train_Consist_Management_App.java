import java.util.ArrayList;
import java.util.List;

public class Train_Consist_Management_App {
    public static void main(String [] args){
        System.out.println("==================================");
        System.out.println("UC2: Add Passenger Bogies to Train");
        System.out.println("==================================");
        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper,AC Chair,First Class\n");
        System.out.println("After adding Bogies:\n"+passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("After Removing Ac Chair:\n"+passengerBogies);

        System.out.println("Checking if sleeper exists:");
        System.out.println("Contains Sleeper? :"+passengerBogies.contains("Sleeper"));

        System.out.println("Final Train Passeger Consist:\n"+passengerBogies);
    }
}