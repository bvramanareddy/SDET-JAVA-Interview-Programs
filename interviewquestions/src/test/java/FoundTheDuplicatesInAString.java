import java.util.HashSet;

public class FoundTheDuplicatesInAString {
    
    private static HashSet<Character> findTheDuplicateCharacters(String s)
{
    HashSet<Character> uniqueChars= new HashSet<>();
    HashSet<Character> duplicateChars = new HashSet<>();
    char[] letters = s.toCharArray();
    for(char ch : letters)
    {
        if(!uniqueChars.add(ch))
        {
            duplicateChars.add(ch);
        }
    }
    return duplicateChars;
}
public static void main(String[] args) {
    
    String name = "AAbbCCDEF";
    System.out.println("The Duplicate characters from the Given string "+ name+  " is "+ findTheDuplicateCharacters(name));
}
}
