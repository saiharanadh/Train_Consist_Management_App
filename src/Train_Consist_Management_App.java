import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Train_Consist_Management_App {
    public static void main(String [] args) {
        System.out.println("========================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("========================================");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        formation.add("Sleeper");

        System.out.println("Final Train Formation:"+formation);
        System.out.println("\n");
        System.out.println("Note:\n LinkedHashSet preserves insertion order and removes duplicates automatically\n");
        System.out.println("UC5 formation setup completed......");
    }
}