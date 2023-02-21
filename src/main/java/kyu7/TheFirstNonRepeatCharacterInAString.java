package kyu7;

/*
You need to write a function, that returns the first non-repeated character in the given string.

If all the characters are unique, return the first character of the string.
If there is no unique character, return null in JS or Java, None in Python, '\0' in C.

You can assume, that the input string has always non-zero length.
Examples

"test"   returns "e"
"teeter" returns "r"
"trend"  returns "t" (all the characters are unique)
"aabbcc" returns null (all the characters are repeated)


 */

public class TheFirstNonRepeatCharacterInAString {
    public static Character firstNonRepeated(String source) {
        if (source.length() > 0) {
            int index = -1;
            char fnc = ' ';
            for (char i : source.toCharArray()) {
                if (source.indexOf(i) == source.lastIndexOf(i)) {
                    fnc = i;
                    break;
                } else {
                    index += 1;
                }
            }
            if (index == 1) {
                return null;
            } else {
                return fnc;
            }
        }
        return '0';
    }
}
