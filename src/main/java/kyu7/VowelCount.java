package kyu7;

public class VowelCount {
    public static int getCount(String str) {
        return str.replaceAll("(?i)[bcdfghjklmnpqrstvwxyz\\d\\W_]", "").length();
    }
}