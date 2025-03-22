import java.util.Arrays;
import java.util.LinkedHashSet;

public class MergeTwoSortedArrays {
    
    private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2)
    {
        LinkedHashSet<Integer> set =  new LinkedHashSet<>();
        for(int num: arr1)
        {
            set.add(num);
        }
        for(int num: arr2)
        {
            set.add(num);
        }
        int[] mergedList= new int[set.size()];
        int index= 0;
        for(int num: set)
        {
            
            mergedList[index++]= num;
        }
        return mergedList;
    }
    public static void main(String[] args) {
        int[] nums1= {1,2,3,4};
        int[] nums2= {5,7,8,9,10};
        int[] resultArray = mergeTwoSortedArray(nums1, nums2);
        System.out.println("Merged Array is "+ Arrays.toString(resultArray));
    }
}
