package kyu8;

import java.util.*;

public class GravityFlip {
    public static int[] flip(char dir, int[] arr) {
        Arrays.sort(arr);

        if (dir == 'R') {

            return arr;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }

        return arr;
    }
}
