import java.util.Arrays;

public class MoveZerosToEndInArray {
    
    private static int[] moveZerosToEndInArray(int[] nums)
    {
        int index =0; 
        for(int num :nums)
        {
            if (num!=0) {
                nums[index++] = num;
            }
        }
        while (index<nums.length) {
            nums[index++]= 0;
            
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums= {0,4,5,7,0,9,8,6,0};
        int[] resultArray = moveZerosToEndInArray(nums);
        System.out.println("Array after moving zeros to End is "+ Arrays.toString(resultArray));
    }
}
