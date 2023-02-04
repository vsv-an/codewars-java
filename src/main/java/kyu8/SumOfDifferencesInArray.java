package kyu8;

import java.util.*;

public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr) {
        //your code;
        int res = 0;
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return res;
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            res += arr[i] - arr[i + 1];
        }

        return res;
    }
}
