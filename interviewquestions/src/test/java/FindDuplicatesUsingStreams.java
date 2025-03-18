import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStreams {
    
    private static Set<Integer> findDuplicatesUsingStreams(int[] array) {
        Set<Integer> unique = new HashSet<>();
        
        return Arrays.stream(array)
                     .boxed()  // Convert int to Integer
                     .filter(n -> !unique.add(n))  // Keep only duplicates
                     .collect(Collectors.toSet()); // Collect into a Set
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 8, 9};

        Set<Integer> dups = findDuplicatesUsingStreams(array);
        System.out.println("Duplicate Values: " + dups);
    }
}
