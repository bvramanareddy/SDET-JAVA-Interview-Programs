import java.util.HashSet;

public class StringabcdOutputaabbccdd {

    //Given input as "abcd" then output as "aabbccdd"
    private static String stringModification(String string)
    {
        HashSet<Character> set =  new HashSet<>();
        StringBuilder sb=  new StringBuilder();
        char[] letters = string.toCharArray();
        for(char letter: letters)
        {
            sb.append(letter);
            if (set.contains(letter)) {
                
                sb.append(letter);
                
            }
            else
            {
                set.add(letter);
                sb.append(letter);
            }
        } return sb.toString();
    }
    public static void main(String[] args) {
         String input = "abcd";
         System.out.println(stringModification(input));
         
    }
    
}
