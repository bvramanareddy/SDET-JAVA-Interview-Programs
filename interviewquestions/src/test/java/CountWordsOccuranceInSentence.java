import java.util.HashMap;

public class CountWordsOccuranceInSentence {

    private static HashMap<String, Integer> findTheWordsOccuranceInAGivenString(String s) {
        String[] words = s.split(" ");
        HashMap<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        return wordMap;
    }

    public static void main(String[] args) {
        String sentence = "Hello Batman Welcome to JAVA JAVA world";
        HashMap<String, Integer> wordsOccurance = findTheWordsOccuranceInAGivenString(sentence);
        System.out.println(wordsOccurance);
    }
}
