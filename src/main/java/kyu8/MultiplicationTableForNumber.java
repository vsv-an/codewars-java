package kyu8;

public class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            sb.append(i + " * " + num + " = " + result + "\n");
        }
        return sb.toString().trim();

//        return "1 * "+ num + " = " + (1 * num) + "\n"
//                + "2 * "+ num + " = " + (2 * num) + "\n"
//                + "3 * "+ num + " = " + (3 * num) + "\n"
//                + "4 * "+ num + " = " + (4 * num) + "\n"
//                + "5 * "+ num + " = " + (5 * num) + "\n"
//                + "6 * "+ num + " = " + (6 * num) + "\n"
//                + "7 * "+ num + " = " + (7 * num) + "\n"
//                + "8 * "+ num + " = " + (8 * num) + "\n"
//                + "9 * "+ num + " = " + (9 * num) + "\n"
//                + "10 * "+ num + " = " + (10 * num); // good luck
    }
}
