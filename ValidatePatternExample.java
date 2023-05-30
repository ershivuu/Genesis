package Questions;

import java.util.regex.*;

public class ValidatePatternExample {
    public static void main(String[] args) {
        String pattern = "^\\+[0-9]{2}-[0-9]{2}[0-9]{6}-[0-9]{4}$";
        String input = "+12-34 567890-1234";
        
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);
        
        if (matcher.matches()) {
            System.out.println("Input is valid");
        } else {
            System.out.println("Input is invalid");
        }
    }
}
