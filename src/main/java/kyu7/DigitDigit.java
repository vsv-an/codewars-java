package kyu7;

/*
Digit*Digit

Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-35)

Note: The function accepts an integer and returns an integer.

Happy Coding!

 */

import java.util.Arrays;

public class DigitDigit {
    public int squareDigits(int n) {
        // TODO Implement me
        String x = Integer.toString(n);
        int[] arr = new int[x.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - 1 - i] = (n % 10) * (n % 10);
            n = n / 10;
        }
        return Integer.parseInt(Arrays.toString(arr).replaceAll("[^0-9]", ""));
    }
}
