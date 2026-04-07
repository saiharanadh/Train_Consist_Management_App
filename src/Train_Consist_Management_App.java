import java.util.*;

public class Train_Consist_Management_App {
    static List<Bogie> bogies;
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
    }
    public static  List<Bogie> bogieList() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("FirstClass", 24));
        bogies.add(new Bogie("General", 90));
        return bogies;
    }
       public static void main(String [] args) {
        System.out.println("==========================================");
        System.out.println("UC8: Filter Passenger Bogies Using Streams");
        System.out.println("==========================================");

       List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie ("Sleeper",72));
        bogies.add(new Bogie ("AC Chair",56));
        bogies.add(new Bogie ("FirstClass",24));
        bogies.add(new Bogie ("General",90));

        System.out.println("Before Sorting:\n");
           for(Bogie b:bogies){
               System.out.println(b.name+"->"+b.Capacity);
           }

        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        System.out.println("After sorting By Capacity:\n");
           for(Bogie b:bogies){
               System.out.println(b.name+"->"+b.Capacity);
           }
        }
    }