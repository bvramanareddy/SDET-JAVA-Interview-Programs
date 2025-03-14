import java.util.Arrays;
import java.util.List;

public class ArrayListComparator {
    
    public static void main(String[] args) {
        
        List<Integer> nums= Arrays.asList(18,3,23,7,43,99);
        nums.sort((a,b)->a-b); // for Sorting in Ascending Order
    //  nums.sort((a,b)->a-b); //for Sorting in Descending Order

        System.out.println(nums);
        int minimum = nums.get(0);
        int max =nums.get(nums.size()-1);
        System.out.println("Minimum Value is "+ minimum);
        System.out.println("Maximum value is "+ max);

        System.out.println("Printing the smallest elment using getFirst "+ nums.getFirst());
        System.out.println("Prinitng the Max element using getLast "+ nums.getLast());

    }
}
