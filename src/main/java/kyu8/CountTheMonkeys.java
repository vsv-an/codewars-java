package kyu8;

public class CountTheMonkeys {
    public static int[] monkeyCount(final int n){
        int[] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }

        return arr;
    }
}
