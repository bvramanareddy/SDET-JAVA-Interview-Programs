public class CheckArrayPalindrome {

    private static boolean isArrayPalindrom(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] != nums[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 2, 1 };
        System.out.println(isArrayPalindrom(nums));
    }
}
