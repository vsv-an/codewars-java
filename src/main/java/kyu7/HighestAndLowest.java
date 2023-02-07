package kyu7;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] str = numbers.split(" ");
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);
        for (int i = 0; i < str.length; i++) {
            if (min > Integer.parseInt(str[i])) {
                min = Integer.parseInt(str[i]);
            }
            if (max < Integer.parseInt(str[i])) {
                max = Integer.parseInt(str[i]);
            }
        }

        return max + " " + min;
    }
}
