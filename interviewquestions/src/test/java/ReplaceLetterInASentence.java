//WAP to replace letter "d" with "D" in "I love My India"


public class ReplaceLetterInASentence {
    
    private static String replaceLowerCaseCharwithUpperCaseChar(String s) {
    
    String newString=  s.replace('d', 'D');
    return newString;
}

public static void main(String[] args) {
    String text= "I Love My India";
    System.out.println("NewTextAfterReplacing is "+ replaceLowerCaseCharwithUpperCaseChar(text));

}
}

