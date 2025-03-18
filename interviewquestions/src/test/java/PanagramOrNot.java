import java.util.HashSet;

public class PanagramOrNot {

    private static void isPanagaram(String s) {
        HashSet<Character> set = new HashSet<>();

        char[] letters = s.toLowerCase().toCharArray();
        for (char c : letters) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }
        if (set.size() == 26) {
            System.out.println("Given Sentence is Panagram");
        } else {
            System.out.println("Given Sentence is NOT a panagram");
        }

    }

    public static void main(String[] args) {

        String sentence = "The quick brown fox jumps over the lazy dog";
        isPanagaram(sentence);
    }
}
