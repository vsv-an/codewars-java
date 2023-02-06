package kyu7;

public class CountConsonants {
    public static int getCount(String str) {
        // ...
        return str.replaceAll("(?i)[aeiou\\d\\W_]", "").length();
    }
}
