package kyu8;

public class FindNumberWhichAreDivisibleByGivenNumber {
    public static int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }
        int[] arr = new int[count];

        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                arr[j] = numbers[i];
                j++;
            }
        }
        return arr;
    }
}
