import java.util.HashSet;

public class Demo {

    private static HashSet<Integer> removeDuplicateElementsFromArray(int[] nums)
    {
        HashSet<Integer> uniqueElements =  new HashSet<>();
        for(int num:nums)
        {
            uniqueElements.add(num);
        }
        return uniqueElements;
    }
    public static void main(String[] args) {
        
        int[] nums= {1,1,2,2,3,3,4,5};
        System.out.println(removeDuplicateElementsFromArray(nums));
    }
    
}
