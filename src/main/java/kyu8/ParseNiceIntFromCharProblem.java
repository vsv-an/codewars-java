package kyu8;

public class ParseNiceIntFromCharProblem {
    public static int howOld(final String herOld) {
        String[] str = herOld.split(" ");

        return Integer.parseInt(str[0]);

    }
}
