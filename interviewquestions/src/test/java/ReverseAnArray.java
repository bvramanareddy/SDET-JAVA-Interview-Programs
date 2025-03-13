import java.util.Arrays;

public class ReverseAnArray {
    
    private static void reverseAnArray(int[] array)
    {
        for(int i=array.length-1; i>=0; i--)
        {
            System.out.print(array[i]+ " ");
        }
    }

    private static int[] reverseArray(int[] nums)
    {
        int[] reverseArray= new int[nums.length];
        int k=nums.length-1;
        for(int num: nums)
        {
            reverseArray[k]= num;
            k--;

        }
        return reverseArray;
    }
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array is "+ Arrays.toString(nums));

        reverseAnArray(nums);
        System.out.println();
        int[] reversedArrayis= reverseArray(nums);
        System.out.println("Reversed Array is "+ Arrays.toString(reversedArrayis));
    }
}
