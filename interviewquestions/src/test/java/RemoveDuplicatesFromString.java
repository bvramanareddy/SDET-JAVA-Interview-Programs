import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
    
    private static String removeDuplicatesFromString(String string)
    {
        LinkedHashSet<Character> uniquCharacters = new LinkedHashSet<>();
        char[] characters = string.toLowerCase().toCharArray();
        StringBuilder result = new StringBuilder();

        for(char c: characters)
        {
            if(uniquCharacters.add(c))
            {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String name =  "RrAMEESHHhhhHH";
        System.out.println(removeDuplicatesFromString(name));
    }
}
