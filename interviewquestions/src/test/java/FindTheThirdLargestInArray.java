import java.util.Arrays;

public class FindTheThirdLargestInArray {

    // Given an unsorted array of integers, find the third largest number in the array
    private static void findThirdLargestInArray(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        System.out.println("Array After Sorting is " + Arrays.toString(array));
        int thirdLargest = array[length - 3];
        System.out.println("Third Largest Element from the Array is " + thirdLargest);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 78, 9, 45, 6, 67, 3 };
        System.out.println("Given Array is " + Arrays.toString(nums));
        findThirdLargestInArray(nums);

    }
}
