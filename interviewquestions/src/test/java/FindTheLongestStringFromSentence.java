public class FindTheLongestStringFromSentence {

    private static String findTheLargestStringFromGivenSentence(String sentence)
    {
        String[] words = sentence.split(" ");
        String longestWord= "";
        for (String word : words) {
           if (word.length()>longestWord.length()) {
            longestWord = word;
           }
                
            }
            return longestWord;
            
        }
        public static void main(String[] args) {
            String sent= "Hi My name is Ramana Reddy";
            System.out.println("Given Sentence is "+ sent);
            System.out.println("The Largest word is "+ findTheLargestStringFromGivenSentence(sent));
        }
    }
