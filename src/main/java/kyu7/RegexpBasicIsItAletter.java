package kyu7;

import java.util.regex.*;

/*
Complete the code which should return true if the given object is
a single ASCII letter (lower or upper case), false otherwise.
 */

public class RegexpBasicIsItAletter {
    public static boolean isLetter(String s) {
        return Pattern.matches("[a-zA-Z]", s);
    }
}
