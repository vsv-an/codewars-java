package kyu8;

public class ReversedSequence {
    public static int[] reverse(int n) {
        //your code
        int[] arr = new int[n];
        for (int i = 0, j = n; i < arr.length; i++, j--) {
            arr[i] = j;
        }
        return arr;
    }
}
