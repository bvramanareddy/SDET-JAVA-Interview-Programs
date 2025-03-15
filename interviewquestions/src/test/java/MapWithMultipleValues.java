import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List; // Import List explicitly

public class MapWithMultipleValues {
    
    public static void main(String[] args) {
        
        HashMap<String, List<Integer>> invoiceMap = new HashMap<>();

        // Adding values: Each key (invoiceId) maps to a list of values
        invoiceMap.put("POS Orders", new ArrayList<>(Arrays.asList(500, 700, 900)));
        invoiceMap.put("Store Orders", new ArrayList<>(Arrays.asList(300, 800)));
        invoiceMap.put("Online Orders", new ArrayList<>(Collections.singletonList(450)));

        // Retrieving values
        System.out.println("Invoice Map: " + invoiceMap);
        
        // Adding a new value to an existing key safely
        invoiceMap.computeIfAbsent("CC Orders", k -> new ArrayList<>()).add(1200);

        System.out.println("Updated Invoice Map: " + invoiceMap);
    }
}
