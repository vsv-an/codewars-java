package kyu8;

public class AlternatingCase {
    public static String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        string = sb.toString();

        return string;
    }
}
