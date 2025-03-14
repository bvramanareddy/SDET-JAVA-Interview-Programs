public class GetInitialsOfEachWordInASentence {
    
    private static String getCaptialofEachWordInSentence(String sentence)
    {
        StringBuilder sb = new StringBuilder();
        String[]  words = sentence.split(" ");
        for(String word:  words)
        {
            if(!word.isEmpty())
            {
                sb.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
        String sentence=  "Hi My name is Ramana";
System.out.println(getCaptialofEachWordInSentence(sentence));
    }
}
