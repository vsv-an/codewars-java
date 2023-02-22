package kyu7;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class ReverseWords {
    public static String reverseWords(final String original) {
        List< String> words = Arrays.asList(original.split("\\s"));
        Collections.reverse(words);
        StringBuilder sb = new StringBuilder(original.length());

        for (int i = words.size() - 1; i >= 0; i--) {
            sb.append(words.get(i));
            sb.append(' ');
        }
        System.out.println(words);
        return sb.toString().trim();
    }
}
