package kyu7;

/*
Complete the function to find the count of the most frequent item of an array. You can assume that input is an array of integers. For an empty array return 0
Example

input array: [3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3]
ouptut: 5

The most frequent number in the array is -1 and it occurs 5 times.

 */

public class FindCountOfMostFrequentItemInAnArray {
    public static int mostFrequentItemCount(int[] collection) {
        // Do your magic :)
        int maxcount = 0;
        for (int i = 0; i < collection.length; i++) {
            int count = 0;
            for (int j = 0; j < collection.length; j++) {
                if (collection[i] == collection[j]) {
                    count++;
                }
                if (maxcount < count) {
                    maxcount = count;
                }
            }
        }
        return maxcount;
    }
}
