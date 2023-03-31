package kyu6;

/*
Simple prime streaming

Consider a sequence made up of the consecutive prime numbers. This infinite sequence would start with:

"2357111317192329313741434753596167717379..."

You will be given two numbers: a and b, and your task will be to return b elements starting from index a in this sequence.

For example:
solve(10,5) == `19232` Because these are 5 elements from index 10 in the sequence.

Tests go up to about index 20000.

More examples in test cases. Good luck!

Please also try Simple time difference

 */

public class SimplePrimeStreaming {    public static String solve(int a, int b) {
        String str = "";
        for (int i = 1; a + b > str.length(); i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 &&  j < i) {
                    break;
                } else if (i == j) {
                    str += i;
                }
            }
        }
        return str.substring(a, a + b); //..
    }
}
