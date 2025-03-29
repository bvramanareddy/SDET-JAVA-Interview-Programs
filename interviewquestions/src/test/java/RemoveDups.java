import java.util.ArrayList;

public class RemoveDups {
    
    private static ArrayList<Integer> removeDuplication(int[] nums)
    {

        ArrayList<Integer> uniqueList =  new ArrayList<>();
        uniqueList.add(nums[0]);
        for(int i=1; i<nums.length; i++)
        {
            if (nums[i]!=nums[i-1]) {
                uniqueList.add(nums[i]);
            }

        }
        return uniqueList;
    }
    public static void main(String[] args) {
        
        int[] nums = {1,1,1,2,3,3,4,5};
       ArrayList<Integer> list = removeDuplication(nums);
       System.out.println(list);
    }
}
