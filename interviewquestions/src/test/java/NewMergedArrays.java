import java.util.ArrayList;

public class NewMergedArrays {
    
    public static void main(String[] args) {
        
        int[] nums1= {8,7,9,10};
        int[] nums2= {1,2,3};

       ArrayList<Integer> newList= new ArrayList<>();
       
       for(int num:nums1)
       {
        newList.add(num);
       }
       for(int num: nums2)
       {
        newList.add(num);
       }
       System.out.println(newList);
        
    }
}
