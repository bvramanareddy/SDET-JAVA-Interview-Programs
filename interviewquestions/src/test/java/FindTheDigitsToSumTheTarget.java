import java.util.ArrayList;
import java.util.Arrays;

public class FindTheDigitsToSumTheTarget {
    
    private static int[] findTheDigitsToMatchSumToTarget(int[] nums, int target)
    {
        int[] result=  new int[2];
        ArrayList<Integer> list =  new ArrayList<>();
        for (int num : nums) {
            int complement=  target- num;
            if(list.contains(complement))
            {
                result[0]= complement;
                result[1]= num;
                return result;
            }
            list.add(num);
            
        }
        return result;
        
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        int target= 11;
        int[] result=  findTheDigitsToMatchSumToTarget(numbers, target);
        System.out.println("The Digits Sum Match to Target is "+ Arrays.toString(result));
    }
}
