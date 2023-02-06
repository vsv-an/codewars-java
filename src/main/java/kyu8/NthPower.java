package kyu8;

public class NthPower {
    public static int nthPower(int[] array, int n) {
        if (n < 0 || n >= array.length) {
            return -1;
        }
        return (int)Math.pow(array[n], n);
    }
}
