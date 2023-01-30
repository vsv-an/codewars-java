package kyu8;

public class SimpleMultiplication {
// This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.

    public static int simpleMultiplication(int n) {
        if (n % 2 == 0) {
            return n * 8;
        }
        return n * 9;
    }
}
