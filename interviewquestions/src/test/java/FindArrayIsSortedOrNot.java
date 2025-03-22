public class FindArrayIsSortedOrNot {

    private static boolean findArrayIsSortedorNot(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }

        }
        return true;
}

    public static void main(String[] args) {
        
        int[] nums = {1,2,3,5,6,7,8};
        System.out.println(findArrayIsSortedorNot(nums));
   
    }
}
