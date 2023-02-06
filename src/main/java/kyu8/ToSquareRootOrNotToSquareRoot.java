package kyu8;

public class ToSquareRootOrNotToSquareRoot {
    public static int[] squareOrSquareRoot(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
//            if (Math.sqrt(array[i]) == (int)Math.sqrt(array[i])) {
                newArray[i] = (int)Math.sqrt(array[i]);
            } else {
                newArray[i] = (int)Math.pow(array[i], 2);
            }
        }
        return newArray;
    }
}
