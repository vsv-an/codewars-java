package kyu7;

import java.util.Arrays;

public class FindTheStrayNumber {
    static int stray(int[] numbers) {
        int result = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1 && numbers[i] == numbers[i + 1]) {
                i++;
            } else {
                result = numbers[i];
            }
        }
        return result;
    }
}
