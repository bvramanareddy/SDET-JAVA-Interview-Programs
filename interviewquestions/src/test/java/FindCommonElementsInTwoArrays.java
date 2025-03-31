import java.util.HashSet;

public class FindCommonElementsInTwoArrays {
    //Find The intersection of two arrays also same logic

    public static HashSet<Integer> findCommonElementsInTwoArrays(int[] nums1, int[] nums2)
    {
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> commonSet= new HashSet<>();

        for(int num: nums1)
        {
           set.add(num);
        }
        for(int num: nums2)
        {
            if (set.contains(num)) {
                commonSet.add(num);
            }
        }
        return commonSet;
    }
    public static void main(String[] args) {
        int[] a1= {1,2,3,4,5,6,7};
        int[] a2= {1,4,6,9,10};
        System.out.println("common Elments are "+ findCommonElementsInTwoArrays(a1, a2));
    }
}
