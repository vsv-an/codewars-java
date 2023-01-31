package kyu8;

public class ReversedWords {
    public static String reverseWords(String str){
        String s[] = str.split(" ");
        String result = "";
        for (int i = s.length - 1; i >= 0; i--) {
            result += s[i];
            if (i > 0) {
                result += " ";
            }
        }

        return result;
    }
}
