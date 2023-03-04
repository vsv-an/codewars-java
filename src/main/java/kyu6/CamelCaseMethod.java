package kyu6;

/*
Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings. All words must have their first letter capitalized without spaces.

For instance:

camelCase("hello case"); // => "HelloCase"
camelCase("camel case word"); // => "CamelCaseWord"

Don't forget to rate this kata! Thanks :)

 */

public class CamelCaseMethod {
    public static String camelCase(String str) {
        // your code here
        if (str.length() == 1) {
            return str.toUpperCase();
        } else if (str.length() > 1) {
            String[] arr = str.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1));
            }
            return sb.toString();
        }
        return str.trim();
    }
}
