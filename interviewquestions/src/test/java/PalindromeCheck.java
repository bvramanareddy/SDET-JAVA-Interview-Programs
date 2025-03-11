public class PalindromeCheck {

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(right) != s.charAt(left))
                return false;
            left++;
            right--;

        }
        return true;
    }

    private static void checkPalindrome(String str) {
        String revString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revString = str.charAt(i)+revString;
        }
        if(str.equalsIgnoreCase(revString))
        {
            System.out.println(str+ " is a Palindrome");
        }
        else
        {
            System.out.println(str + " is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {

        String string = "MADAM";
        System.out.println(isPalindrome(string));
        System.out.println(isPalindrome("RAJU"));
        checkPalindrome(string);
    }
}
