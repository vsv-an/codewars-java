package kyu8;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String result = "";

        if (string != null) {
            for (int i = 0; i < repeat; i++) {
                result += string;
            }

            return result;
        }

        return "";
    }
}
