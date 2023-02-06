package kyu8;

import org.apache.commons.lang3.StringUtils;

public class AllStarCodeChallenge18 {
    public static int strCount(String str, char letter) {

        return StringUtils.countMatches(str, letter);

//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (letter == str.charAt(i)) {
//                count++;
//            }
//        }
//        return count;
    }
}
