import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesInArray {
    
    private static int[] removeDuplicateElementsFromArray(int[] nums)
    {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for(int num: nums)
        {
            uniqueElements.add(num);
        }
        int[] result = new int[uniqueElements.size()];
        int i=0;
        for(int num: uniqueElements)
        {
            result[i] =  num;
            i ++;

        }
        return result;
    }
    public static void main(String[] args) {
        int[] array =  {1,1,2,2,3,3,4,4,4,5,5,5,6};
        int[] uniqueArray = removeDuplicateElementsFromArray(array);
        System.out.println(Arrays.toString(uniqueArray));
    }
}
