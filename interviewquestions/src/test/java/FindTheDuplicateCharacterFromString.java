import java.util.HashMap;

public class FindTheDuplicateCharacterFromString {

    private static void findTheDuplicateCharacterFromString(String string)
    {
        char[] chars = string.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch:chars)
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        map.forEach((K, V)-> 
        {
            if (V>1) {
                System.out.println(K + " appeared "+ V + "times");
            }
        });

    }
    public static void main(String[] args) {
        
        String s= "Hello";
        findTheDuplicateCharacterFromString(s);
    }
}