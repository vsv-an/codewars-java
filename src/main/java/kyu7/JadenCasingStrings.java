package kyu7;

public class JadenCasingStrings {
    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null || phrase.length() == 0) return null;
        String[] str = phrase.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(Character.toUpperCase(str[i].charAt(0)))
                    .append(str[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}
