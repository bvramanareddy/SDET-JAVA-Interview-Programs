import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUniqueValuesUsingStreams {

    private static Set<Integer> findUniqueValuesUsingStreams(int[] array)
    {
        HashSet<Integer> unique = new HashSet<>();
        return Arrays.stream(array).boxed().filter(n->unique.add(n)).collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,5,5,6,7};
     Set<Integer> uniqueValues=    findUniqueValuesUsingStreams(nums);
     System.out.println("Original input Array is "+ Arrays.toString(nums));
     System.out.println("Unique Values are "+ uniqueValues);
    }
    
}
