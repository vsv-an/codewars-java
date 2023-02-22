package kyu7;

/*
Write a function that takes a positive integer n, sums all the cubed values from 1 to n (inclusive), and returns that sum.

Assume that the input n will always be a positive integer.

Examples: (Input --> output)

2 --> 9 (sum of the cubes of 1 and 2 is 1 + 8)
3 --> 36 (sum of the cubes of 1, 2, and 3 is 1 + 8 + 27)


 */

public class SumOfCubes {
    public static long sumCubes(long n) {
        long result = 0;
        for (int i = 0, k = 1; i <= n; i++, k++) {
            result += (long)Math.pow(i, 3);
//            System.out.print(result + " ");


        }
        return result;
    }
}
