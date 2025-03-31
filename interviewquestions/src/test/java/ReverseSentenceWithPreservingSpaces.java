import java.util.ArrayList;

public class ReverseSentenceWithPreservingSpaces {
    
    public static String reverseStringWithSpaces(String string)
    {
        String[] words = string.split(" ");
        StringBuilder fullReversedString = new StringBuilder();
        ArrayList<String> list =  new ArrayList<>();
        String revString = "";
        for(int i=words.length-1; i>=0; i--)
        {
            
            for(int j=words[i].length()-1;j>=0; j--)
            {
                revString+=words[i].charAt(j);
            }
            revString+=" ";

        }
        return fullReversedString.append(revString).toString();
    }
    public static void main(String[] args) {
        
        String sentence= "My name is Ramana Reddy";
        System.out.println("Given String is: "+ sentence);
        System.out.println("Reversed String is: " +reverseStringWithSpaces(sentence));
    }
}
