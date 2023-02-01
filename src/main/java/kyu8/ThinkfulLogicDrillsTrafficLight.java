package kyu8;

public class ThinkfulLogicDrillsTrafficLight {
    public static String updateLight(String current) {
        if (current == "green") {

            return "yellow";
        } else if (current == "yellow") {

            return "red";
        }

        return "green";
    }
}
