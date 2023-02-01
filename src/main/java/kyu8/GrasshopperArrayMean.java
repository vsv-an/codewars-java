package kyu8;

public class GrasshopperArrayMean {
    public static int findAverage(int[] nums) {
        int sum = 0;

        for (int x : nums) {
            sum += x;
        }

        return sum / nums.length;
    }
}
