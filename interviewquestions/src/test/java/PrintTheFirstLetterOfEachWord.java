public class PrintTheFirstLetterOfEachWord {
    
    private static String printFirstLetterOfEachWord(String sentence)
    {
        StringBuilder firstLetters=  new StringBuilder();
        String[] words =  sentence.split(" ");
        for (String string : words) {
            firstLetters.append(string.charAt(0));
        }
        return firstLetters.toString();
    }
    public static void main(String[] args) {
        
        String sent = "Alpha Bravo Charlee Delta Echo Fox";
        System.out.println("The First Letter from the sentence "+ "\"" +sent+ "\""+ " are below ");
        System.out.println(printFirstLetterOfEachWord(sent));
    }
}
