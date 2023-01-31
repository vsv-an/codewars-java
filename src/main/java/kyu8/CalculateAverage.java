package kyu8;

public class CalculateAverage {
// Write a function which calculates the average of the numbers in a given list.
//
//Note: Empty arrays should return 0.

    public static double find_average(int[] array){
        int result = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                result += array[i];
            }

            return result / array.length;
        }

        return 0;
    }
}
