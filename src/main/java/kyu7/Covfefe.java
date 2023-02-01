package kyu7;

public class Covfefe {
    public static String covfefe(String tweet) {
        if (tweet.contains("coverage")) {

            return tweet.replaceAll("coverage", "covfefe");
        }

        return tweet + " covfefe";
    }
}
