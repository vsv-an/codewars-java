package kyu6;

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
Examples

"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"

 */

public class ConvertStringToCamelCase {
    static String toCamelCase(String s){
        String[] arr = s.split("[_-]");
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                str += arr[i];
            } else {
                str += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
            }
        }
        return str;
    }
}
