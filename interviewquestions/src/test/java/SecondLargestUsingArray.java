import java.util.Arrays;

public class SecondLargestUsingArray {
    
    private static void findSecondLargest(int[] nums)
    {
        int largest = nums[0];
        int secondLargest= -1;

        for(int num: nums)
        {
            if (num>largest) {
                secondLargest= largest;
                largest= num;
                
            }
            else if (num >secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if (secondLargest==-1) {
            System.out.println("There is No second Largest Element");
        }
        else
        {
            System.out.println("The Second Largest Element is "+ secondLargest);
        }
    }
    public static void main(String[] args) {
        
        int[] nums ={10,12,9,7,2};
        System.out.println("Given Array is " +Arrays.toString(nums));
        findSecondLargest(nums);
    }
}
