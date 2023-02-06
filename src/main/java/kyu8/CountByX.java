package kyu8;

public class CountByX {
    public static int[] countBy(int x, int n){
        // Your code here
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (i + 1) * x;
        }
        return arr;
    }
}
