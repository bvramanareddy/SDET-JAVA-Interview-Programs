public class RevString {
    
    private static String reverseTheString(String s)
    {
        String revString =  "";
        for(char c: s.toCharArray())
        {
            revString= c+ revString;
        }
        return revString;
    
    }
    public static void main(String[] args) {
        
        String name = "RAMANA";
        System.out.println(reverseTheString(name));
    }
}
