package kyu8;

public class HolidayVISharkPontoon {
    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {
        int n;
        if (dolphin == true) {
            n = sharkSpeed / 2;
        } else {
                n = sharkSpeed;
            }
        if (pontoonDistance / youSpeed < sharkDistance / n) {
            return "Alive!";
        }
            return "Shark Bait!";
    }
}
