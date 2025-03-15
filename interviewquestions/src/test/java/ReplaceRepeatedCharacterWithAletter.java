import java.util.HashMap;

public class ReplaceRepeatedCharacterWithAletter {
    
    private static String replaceTheRepeatedCharacterWithGivenLetter(String string, char replacement)
    {

        HashMap<Character, Integer> map = new HashMap<>();

        char[] chars = string.toCharArray();
        for(char c: chars)
        {
            map.put(c, map.getOrDefault(c,  0)+1);
        }

        //This is showing how mant time each character is occuerd in the map
        map.entrySet().forEach(entry->System.out.println("character "+ entry.getKey()+ " ,  count " +entry.getValue()));
     
        // This will replace the repeated characters with given replacement
        for(int i=0; i<chars.length; i++)
        {
            if(map.get(chars[i])>1)
            {
                chars[i] =  replacement;
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        
        String s= "RamanaReddy";
        char replacement = 'Z';
        System.out.println("Original String is "+ s);
        System.out.println("String After replacing the repeated character with--< "+ replacement +" >-- " + replaceTheRepeatedCharacterWithGivenLetter(s, replacement));

    }
}
