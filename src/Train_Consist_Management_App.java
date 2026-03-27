import java.util.LinkedList;
import java.util.List;

public class Train_Consist_Management_App {
    public static void main(String [] args) {
        System.out.println("==============================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("==============================");

        List<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        System.out.println("Initial Train Consist:\n"+trainConsist);

        trainConsist.add(1,"Pantry Car");
        System.out.println("After inserting 'Pantry car' At position 2:\n"+trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After removing first and last bogie:\n"+trainConsist);
        System.out.println("\n");
        System.out.println("UC4 Ordered consist operations completed......");
    }
}