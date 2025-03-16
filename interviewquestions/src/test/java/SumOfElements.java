public class SumOfElements {
    
    private static int sumOfElementsInArray(int[] array)
    {
        int sum= 0;
        for(int i=0; i<array.length; i++)
        {
        sum+=array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        
        int[] nums = {1,24,65,4,46,8,8,78};
        System.out.println("Sum of Elements from Array is "+ sumOfElementsInArray(nums));
        
    }
}
