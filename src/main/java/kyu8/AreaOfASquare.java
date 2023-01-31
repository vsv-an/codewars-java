package kyu8;

public class AreaOfASquare {
    public static double squareArea(double A){

        return Math.round((Math.pow((2 * A / Math.PI), 2)) * 100.0) / 100.0;
    }
}
