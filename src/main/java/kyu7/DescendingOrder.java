package kyu7;

/*
Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
Examples:

Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321

 */

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code
        if (num >= 0) {
            String[] str = String.valueOf(num).split("");
            int[] arr = new int[str.length];

            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                    arr[i] = arr[arr.length - 1 - i];
                    arr[arr.length - 1 - i] = temp;
            }

            int result = 0;

            for (int i = 0; i < arr.length; i++) {
                result = result * 10 + arr[i];
            }
            System.out.println(result);
            return result;
        }
        return -1;
    }
}
