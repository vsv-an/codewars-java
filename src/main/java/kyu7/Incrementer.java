package kyu7;

/*
Given an input of an array of digits, return the array with each digit incremented by its position in the array: the first digit will be incremented by 1, the second digit by 2, etc. Make sure to start counting your positions from 1 ( and not 0 ).

Your result can only contain single digit numbers, so if adding a digit with its position gives you a multiple-digit number, only the last digit of the number should be returned.
Notes:

    return an empty array if your array is empty
    arrays will only contain numbers so don't worry about checking that

Examples:

[1, 2, 3]  -->  [2, 4, 6]   #  [1+1, 2+2, 3+3]

[4, 6, 9, 1, 3]  -->  [5, 8, 2, 5, 8]  #  [4+1, 6+2, 9+3, 1+4, 3+5]
                                       #  9+3 = 12  -->  2


 */

import java.util.Arrays;

public class Incrementer {
    public static int[] incrementer(int[] numbers) {
        if (numbers != null && numbers.length > 0) {
            int[] arr = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                if ((numbers[i] + i + 1) < 10) {
                    numbers[i] = numbers[i] + i + 1;
                } else {
                     numbers[i] = (numbers[i] + i + 1) % 10;
                }
            }
            return numbers;
        }
        return new int[]{}; // replace with your code ..
    }
}
