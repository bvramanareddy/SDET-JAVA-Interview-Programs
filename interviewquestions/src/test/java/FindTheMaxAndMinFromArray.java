public class FindTheMaxAndMinFromArray {
    private static void checkMaxAndMinValueFromArray(int[] nums){
int max =Integer.MIN_VALUE;
int min =Integer.MAX_VALUE;

        for(int num: nums)
        {
            if(num> max){
                max = num;
            }
            else if(num<min){
                min = num;
            }
        }
        System.out.println("The Maximum Value is "+ max + " And the Minimum value is "+ min);
    }
    public static void main(String[] args) {
        int[] nums= {1,45,66,87,3};
        checkMaxAndMinValueFromArray(nums);
    }
}
