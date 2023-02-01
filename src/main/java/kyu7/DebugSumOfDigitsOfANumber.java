package kyu7;

public class DebugSumOfDigitsOfANumber {
    public static int sumOfDigits(int n) {
        Integer sum = 0;
        String digits = n + "";
        String[] str = digits.split("");

        for (int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }

        return sum;
    }
}
