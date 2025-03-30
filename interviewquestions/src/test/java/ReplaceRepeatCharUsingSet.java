import java.util.HashSet;

public class ReplaceRepeatCharUsingSet {

    private static String replaceRepeatedCharacterWithGivenChar(String string, char replacement) {
        char[] letters = string.toLowerCase().toCharArray();
        StringBuilder newString = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (Character letter : letters) {
            if (set.contains(letter)) {
                newString.append(replacement);
            } else {
                newString.append(letter);
                set.add(letter);
            }
        }
        return newString.toString();
    }

    public static void main(String[] args) {

        String name = "Hello My name is RAMANA REDDy";
        char replacemnt = 'X';
        System.out.println(replaceRepeatedCharacterWithGivenChar(name, replacemnt));
    }
}
