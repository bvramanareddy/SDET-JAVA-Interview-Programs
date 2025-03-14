import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharsFromString {
    
    private static String removeDuplicateCharactersFromString(String s)
    {
        HashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
       
        for(char ch: chars)
        {
            set.add(ch);
        }
        for(char c: set)
        {
           sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
        String string= "RAMANAYYYZZZZSSSS";
       System.out.println(removeDuplicateCharactersFromString(string));
    }
}
