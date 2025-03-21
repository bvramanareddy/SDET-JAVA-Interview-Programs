public class RemoveUnwantedCharsFromString {
    
    private static String removeUnwantedCharactersFromString(String s)
    {
        
       return s.replaceAll("[^a-zA-Z0-9@.]", "");
             
    }
    public static void main(String[] args) {
        String name = "Ramana$%^&*&^%$Redd((*(*(y654&^%$@*&^%gmail.*&^%$com))))";
        System.out.println(removeUnwantedCharactersFromString(name));
    }
}
