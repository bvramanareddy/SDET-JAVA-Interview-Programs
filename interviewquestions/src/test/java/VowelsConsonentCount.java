public class VowelsConsonentCount {

    private static void findVowelsAndConsonentsCount(String string) {
        String vowels = "aeiouAEIOU";
        int vowelCount = 0;
        int consonentCount = 0;

        for (int i = 0; i < string.toCharArray().length; i++) {
            char ch = string.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            } else {
                consonentCount++;
            }
        }
        System.out.println("Vowels found on the String " + vowelCount);

        System.out.println("Consonents found on the String " + consonentCount);

    }
    public static void main(String[] args) {
        
        String name = "aeiouBCDFGHJKLMNO";
        findVowelsAndConsonentsCount(name);
    }
}
