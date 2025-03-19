import java.util.Arrays;

public class FindTheDigitsThatMakesTargetSum {
    
    private static int[] findTheSumOfDigitsThatMakeSumTarget(int[] nums, int target)
    {
        int left = 0; 
        int right = nums.length-1;

        while (left<right) {
            int sum= nums[left] +nums[right];
            if (sum==target) {
                return new int[]  {nums[left], nums[right]};
            }
            else if(sum <target)
            {
                left++;
            }
            else
            {
                right--;
            }
                
            }
        return new int[] {} ;
    }
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5,6};
        int target= 11;

       int[] result=  findTheSumOfDigitsThatMakeSumTarget(nums, target);
       System.out.println("Given Array is " + Arrays.toString(nums));
       System.out.println("The Given Target is "+target+ " And the digits are " + Arrays.toString(result));
    }
}
