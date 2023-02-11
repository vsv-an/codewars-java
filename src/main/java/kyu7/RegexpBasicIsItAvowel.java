package kyu7;

import java.util.regex.*;

/*
Implement the function which should return true if given object is
a vowel (meaning a, e, i, o, u, uppercase or lowercase), and false otherwise.
 */

public class RegexpBasicIsItAvowel {
    public static boolean isVowel(String s) {
        // your code goes here
        return Pattern.matches("[aeiouAeEIOU]", s);
    }
}
