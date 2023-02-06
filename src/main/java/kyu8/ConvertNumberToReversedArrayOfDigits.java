package kyu8;

public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        // Code here
        StringBuilder str = new StringBuilder(String.valueOf(n));
        String[] strArr = str.reverse().toString().split("");
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        return intArr;
    }
}
