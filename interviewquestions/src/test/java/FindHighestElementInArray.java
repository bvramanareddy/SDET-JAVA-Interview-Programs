public class FindHighestElementInArray {
    
    private static int findMaxElementInArray(int[] array)
    {
        int maxElement = Integer.MIN_VALUE;
        for(int num: array)
        {
            if(num>maxElement)
            {
                maxElement=  num;
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        
        int[] nums = {1,2,34,56,5,88,9,19};
        System.out.println("Highest Element in Array is "+ findMaxElementInArray(nums));
    }
}
