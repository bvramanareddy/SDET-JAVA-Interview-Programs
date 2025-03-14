import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveTheSecondHighestElementFromHashMap {

    private static void removeSecondHighestElementFromHashMap(Map<String, Integer> map) {
        if (map.size() < 2) {
            System.out.println("Map size is less than two hence we cannot remove second Highest element ");
            return;
        }
        // This will convert the MAP to List
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        // Sort the values in descending order as we are using e2 value first
        entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        String valueToRemove = entries.get(1).getKey();

        map.remove(valueToRemove);
        System.out.println("Removed Element from the Map is " + valueToRemove + " ->> " +entries.get(1).getValue());
        System.out.println("The new map is "+ map);
    }
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("E", 40);
        map.put("F", 50);
        map.put("G", 60);

        System.out.println("The Original Map is "+ map);
        removeSecondHighestElementFromHashMap(map);


    }
}