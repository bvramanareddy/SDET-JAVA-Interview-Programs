import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    
    private static Character firstNonRepeatedChar(String string)
    {
        HashMap<Character, Integer>  map=  new LinkedHashMap<>();
        for(char c:string.toCharArray())
        {
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet())
        {
            if(entry.getValue()==1)
            return entry.getKey();
        }
        return '_';
    }

    public static void main(String[] args) {
        String word= "RReddYs";
        System.out.println("First Non Repeated Character from the String "+ word + " is "+ firstNonRepeatedChar(word));
    }
}
