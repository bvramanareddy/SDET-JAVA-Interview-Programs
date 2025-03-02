import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays.*;

public class MergeArrays {

    public static void main(String[] args) {
        
   
    
    Integer[] nums1= {1,2,4};
    Integer[] nums2= {2,6,9};

    ArrayList<Integer> mergedList= new ArrayList<>();
    
    mergedList.addAll(Arrays.asList(nums1));
    mergedList.addAll(Arrays.asList(nums2));
    System.out.println(mergedList);
}
}
