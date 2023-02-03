package kyu8;

public class AbbreviateAtwoWordName {
    public static String abbrevName(String name) {
        String[] str = name.split(" ");

        return str[0].substring(0, 1).toUpperCase() + "." + str[1].substring(0, 1).toUpperCase();
    }
}
