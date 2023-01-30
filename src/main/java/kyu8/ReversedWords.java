package kyu8;

public class ReversedWords {
// Complete the solution so that it reverses all of the words within the string passed in.
//
// Words are separated by exactly one space and there are no leading or trailing spaces.
//
// Example(Input --> Output):
// "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"

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
