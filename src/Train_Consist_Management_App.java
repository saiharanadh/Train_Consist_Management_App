import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Train_Consist_Management_App {
    static class Bogie{
        String name;
        int Capacity;
        Bogie(String name,int Capacity){
            this.name=name;
            this.Capacity=Capacity;
        }
        private int getCapacity() {
            return Capacity;
        }
       public static void main(String [] args) {
        System.out.println("==========================================");
        System.out.println("UC7 - Sort Bogies By Capacity (Comparator)");
        System.out.println("==========================================");

       List<Bogie> bogies = new ArrayList<>();
       Bogie b1 = new Bogie ("Sleeper",72);
       Bogie b2 = new Bogie ("AC Chair",56);
       Bogie b3 = new Bogie ("FirstClass",24);
       Bogie b4 = new Bogie ("General",90);
        bogies.add(b1);
        bogies.add(b2);
        bogies.add(b3);
        bogies.add(b4);
        System.out.println("Before Sorting:\n"+bogies);
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        System.out.println("After sorting By Capacity:\n"+bogies);
        }
    }
}