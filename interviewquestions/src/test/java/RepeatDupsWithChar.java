import java.util.HashMap;

public class RepeatDupsWithChar {
    
    private static String replaceDuplicateCharWithGivenChar(String string, char c)
    {
        //RAMANA -  RZMZNZ
      
        HashMap<Character, Integer> map=  new HashMap<>();
        char[] letters =  string.toLowerCase().toCharArray();
        for (char letter : letters) {
           map.put(letter, map.getOrDefault(letter, 0)+1);
        }
        for(int i=0; i<letters.length; i++)
        {
           if (map.get(letters[i])>1) {
            letters[i]=c;
           }
        }

        return new String(letters);
    }
    public static void main(String[] args) {
        
        String name = "RAMANAR";
        char ch= 'Z';
        System.out.println(replaceDuplicateCharWithGivenChar(name, ch));
    }
}
