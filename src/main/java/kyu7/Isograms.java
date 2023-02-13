package kyu7;

import java.util.*;

public class Isograms {
    public static boolean isIsogram(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;

//        return str.toLowerCase().chars().distinct().count() == str.length();
    }
}
