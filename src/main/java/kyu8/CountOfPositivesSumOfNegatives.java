package kyu8;

public class CountOfPositivesSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;

        if (input == null || input.length == 0) {
            int[] emptyArray = {};
            return emptyArray;
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            } else {
                sum += input[i];
            }
        }
        int[]arr = new int[] {count, sum};

        return arr;
    }
}
