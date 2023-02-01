package kyu8;

public class TransportationOnVacation {
    public static int rentalCarCost(int d) {
        int sum = 0;

        if (d < 3) {
            sum = d * 40;
        } else if (d < 7) {
            sum = (d * 40) - 20;
        } else {
            sum = (d * 40) - 50;
        }

        return sum;
    }
}
