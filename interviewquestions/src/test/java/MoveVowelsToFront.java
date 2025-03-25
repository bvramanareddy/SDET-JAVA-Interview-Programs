public class MoveVowelsToFront {
    
    private static String moveVowelsToFront(String string)
    {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonents= new StringBuilder();
        for(char c: string.toCharArray())
        {
            if (isVowel(c)) {
                vowels.append(c);
                
            }
            else
            {
                consonents.append(c);
            }
        }
        return vowels.append(consonents).toString();
    }

    private static boolean isVowel(char ch)
    {
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
    public static void main(String[] args) {
        
        String name = "ABCDEFGHIJKOLMUV";
        System.out.println(moveVowelsToFront(name));
    }
}
