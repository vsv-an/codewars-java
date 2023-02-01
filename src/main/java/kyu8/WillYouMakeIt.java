package kyu8;

public class WillYouMakeIt {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        if (distanceToPump <= mpg * fuelLeft) {

            return true;
        }

        return false;
    }
}
