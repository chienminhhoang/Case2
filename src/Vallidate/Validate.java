package Vallidate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validate {
    private static final String ACCOUNT_REGEX = "^(?=.*[a-z])(?=.*[0-9]).{8,12}$";
    private static final String PASS_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$]).{8,16}$";
    private static final String PHONE_REGEX = "^[0-9].{8,12}$";
    private static final String EMAIL_REGEX = "^([a-zA-Z0-9]+)([\\.{1}])?([a-zA-Z0-9]+)\\@gmail([\\.])com+$";

    public Validate() {
    }

    public static boolean validateAccount(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validatePassword(String regex) {
        Pattern pattern = Pattern.compile(PASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validatePhone(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validateEmail(String regex) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
