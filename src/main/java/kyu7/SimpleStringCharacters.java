package kyu7;

/*
In this Kata, you will be given a string and your task will be to return a list of ints detailing the count of uppercase letters, lowercase, numbers and special characters, as follows.

Solve("*'&ABCDabcde12345") = [4,5,5,3].
--the order is: uppercase letters, lowercase, numbers and special characters.

More examples in the test cases.

Good luck!

 */

public class SimpleStringCharacters {
    public static int[] Solve(String word) {
        char[] chars = word.toCharArray();
        int[] arr = new int[4];

        for (int i = 0; i <= chars.length - 1; i++) {
            if (Character.isUpperCase(chars[i])) {
                arr[0]++;
            } else if (Character.isLowerCase(chars[i])) {
                arr[1]++;
            }else if (Character.isDigit(chars[i])) {
                arr[2] ++;
            }else {
                arr[3]++;
            }
        }
        return arr;

//        return new int[] {
//                word.replaceAll("[^A-Z]", "").length(),
//                word.replaceAll("[^a-z]", "").length(),
//                word.replaceAll("[^0-9]", "").length(),
//                word.replaceAll("[\\w]", "").length()
//        };
    }
}
