public class RemoveCharacter {
    
    private static String removeGivenCharFromString(String string, char ch)
    {

    char[] chars = string.toCharArray();
       int j=0;
    for(int i=0; i<chars.length; i++)
    {
if (chars[i]!=ch) {
    chars[j++]= chars[i];
    
}
    }
    return new String(chars,0,j);
   
    }
    public static void main(String[] args) {
        
        String name = "Ramana";
        char charToRemove = 'a';
        System.out.println(removeGivenCharFromString(name, charToRemove));
    }
}
