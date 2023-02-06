package kyu7;

import java.util.*;

public class LargestElements {
    public static int[] largest(int n, int[] arr) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, arr.length - n, arr.length);
    }
}
