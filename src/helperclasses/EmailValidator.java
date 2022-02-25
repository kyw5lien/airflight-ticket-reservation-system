package helperclasses;

import java.util.regex.Pattern;

/**
 *  An E-mail Validator class.
 * @author kyw5lien
 */
public class EmailValidator {
    /**
     * Checks if the e-mail provided is in the correct format (i.e., name@domain).
     * @param email the e-mail to be checked.
     * @return true if the e-mail provided is in the correct format; returns false if otherwise.
     * @author kyw5lien
     */
    public static boolean isEmailValid(String email){
        String emailRegEx = "^(.+)@(.+).(.+)";
        Pattern pattern = Pattern.compile(emailRegEx);

        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Error: Invalid E-mail!");
        } else{
            return true;
        }
    }
}