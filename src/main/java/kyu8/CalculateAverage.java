package kyu8;

public class CalculateAverage {
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
