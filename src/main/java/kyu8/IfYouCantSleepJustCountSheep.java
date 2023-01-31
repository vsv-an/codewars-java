package kyu8;

public class IfYouCantSleepJustCountSheep {
    public static String countingSheep(int num) {
        String count = "";

        for (int i = 1; i <= num; i++) {
            count += i + " sheep...";
        }
        return count;
    }
}
