package kyu8;

import java.util.regex.*;

/*
Implement String#digit? (in Java StringUtils.isDigit(String)),
which should return true if given object is a digit (0-9), false otherwise.
 */

public class RegexpBasicIsItAdigit {
    public static boolean isDigit(String s) {

        return Pattern.matches("[0-9]", s);
    }
}
