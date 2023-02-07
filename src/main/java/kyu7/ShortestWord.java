package kyu7;

public class ShortestWord {
    public static int findShort(String s) {
        String[] str = s.split(" ");
        int shortestWord = str[0].length();

        for (int i = 0; i < str.length; i++) {
            if (shortestWord > str[i].length()) {
                shortestWord = str[i].length();
            }
        }
        return shortestWord;
    }
}
