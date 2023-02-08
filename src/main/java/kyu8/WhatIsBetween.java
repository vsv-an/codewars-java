package kyu8;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        int[] arr = new int[b - a + 1];

        for (int i = 0, j = a; i < arr.length; i++, j++) {
            arr[i] = j;
        }
        return arr;
    }
}
