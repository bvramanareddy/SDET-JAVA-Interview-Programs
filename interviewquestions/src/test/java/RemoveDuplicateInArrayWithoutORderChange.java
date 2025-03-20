import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateInArrayWithoutORderChange {

    
private static int[] removeDuplicateInArrayWithoutChangingOrder(int[] nums)
{
    LinkedHashSet<Integer> set =  new LinkedHashSet<>();

    for (int num : nums) {
    set.add(num);        
    }
    int[] result = new int[set.size()];
    int index= 0;
    for(int num: set)
    {
        result[index]= num;
        index++;
    }
    return result;
}
public static void main(String[] args) {
    
    int[] nums = {1,2,3,3,4,5,4};
    int[] result = removeDuplicateInArrayWithoutChangingOrder(nums);
    System.out.println("Original Array "+ Arrays.toString(nums));
    System.out.println("Unique Array preserving Order "+ Arrays.toString(result));
}
}