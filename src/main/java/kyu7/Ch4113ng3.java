package kyu7;

/*
Make your strings more nerdy: Replace all 'a'/'A' with 4, 'e'/'E' with 3 and 'l' with 1 e.g. "Fundamentals" --> "Fund4m3nt41s"
 */

public class Ch4113ng3 {
    public static String nerdify(String txt){
        return txt.replaceAll("[aA]", "4").replaceAll("[eE]", "3").replaceAll("l", "1");
    }
}
