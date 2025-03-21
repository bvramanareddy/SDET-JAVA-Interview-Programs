import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPatternVerify {

    // Corrected the email pattern with the proper escape sequence for backslashes
    private static final String email_Pattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public static void main(String[] args) {
        String email = "ramanreddy654@gmail.com";
        
        if (isValidEmail(email)) {
            System.out.println(email + " Email Pattern is correct");
        } else {
            System.out.println(email + " Email Pattern is not matched");
        }
    }

    // Method to validate the email using the regex pattern
    private static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(email_Pattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
