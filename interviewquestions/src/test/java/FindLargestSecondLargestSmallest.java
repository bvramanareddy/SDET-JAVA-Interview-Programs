import java.util.Arrays;

public class FindLargestSecondLargestSmallest {
    
    private static int findLargestElementFromArray(int[] nums)

    {
        int largestElement = Integer.MIN_VALUE;
        for(int num: nums)
        {
            if (num>largestElement) {
                largestElement= num;
            }
        }
        return largestElement;
    }

    private static int findSecondLargestElementInArray(int[] nums)
    {
        int largest= Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num>largest) {
                secondLargest= largest;
                largest =num;
            }
            else if (num<largest && num !=largest) {
                secondLargest= num;
            }
        }
        return secondLargest;
    }

    private static int findSecondSmallestElement(int[] nums)
    {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int num: nums)
        {
            if (num<smallest) {
                secondSmallest = smallest; 
                smallest= num;
                
            } else if (num>smallest && num<secondSmallest) {
                secondSmallest=  num;
                
            }
        }
        return secondSmallest;
    }
    private static  int findSmallestElementInArray(int[] nums)
    {
        int smallest = Integer.MAX_VALUE;
        for(int num: nums)
        if (num<smallest) {
            smallest= num;
            
        }
        return smallest;
    }

    private static void usingArrayBuiltInMethods(int[] nums)
    {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest= nums[nums.length-1];
        int secondSmallest = nums[1];
        int secondLargest= nums[nums.length-2];
        System.out.println("Here We are using ARRAYS.SORT then with indexing we are getting the values");
        System.out.println("using BuiltIn Methods --> Smallest "+ smallest);
        System.out.println("using BuiltIn Methods --> Second Smallet "+ secondSmallest);
        System.out.println("using BuiltIn MEthods --> Largest "+ largest);
        System.out.println("using BuiltIn Methods --> Second Largest "+ secondLargest);
    }
    public static void main(String[] args) {
        int[] nums = {1,22,4,5,66,7,8,99};
        System.out.println("The Given Array is "+ Arrays.toString(nums));
        System.out.println("Largest Element in Array is "+ findLargestElementFromArray(nums));
        System.out.println("Second Largest Element in Array is " + findSecondLargestElementInArray(nums));
        System.out.println("Second SMALLEST element from the array is "+findSecondSmallestElement(nums));
        System.out.println("Smallesy Element from the Array is "+ findSmallestElementInArray(nums));
        usingArrayBuiltInMethods(nums);
    }
}
