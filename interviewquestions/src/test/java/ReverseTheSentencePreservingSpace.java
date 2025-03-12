public class ReverseTheSentencePreservingSpace {

    // Input: REDDY RAMANA IS NAME MY
    // Output: MY NAME IS RAMANA REDDY 
    private static String reverseTheSentenceWithPreservingSpaces(String str) {
        String[] words = str.split(" ");
        String reversedSentence = "";
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence = sb.append(words[i]).append(" ").toString();
        }
        return reversedSentence;
    }

    public static void main(String[] args) {

        String sentence = "REDDY RAMANA IS NAME MY";

        System.out.println(reverseTheSentenceWithPreservingSpaces(sentence));
    }
}
