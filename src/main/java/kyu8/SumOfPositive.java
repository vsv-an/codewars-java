package kyu8;

public class SumOfPositive {
    public static int sum(int[] arr){
        int sum = 0;
        for (int x : arr) {
            if (x > 0) {
                sum += x;
            }
        }
        return sum;
    }
}
