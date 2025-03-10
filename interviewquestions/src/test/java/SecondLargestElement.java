import java.util.Arrays;

public class SecondLargestElement {
    
    private static int findSecondLargestElement(int[] nums)
    {
        int max= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        for(int num: nums)
        {
            if(num>max)
            {
                secondLargest= max;
                max = num;
            }
            else if (secondLargest != max && secondLargest> num)
            {
                secondLargest= num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] nums= {1,2,6,7,3,9};
        System.out.println("The Given arra is "+ Arrays.toString(nums));
        System.out.println("Second Largest Element is "+findSecondLargestElement(nums));
    }
}
