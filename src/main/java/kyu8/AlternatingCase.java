package kyu8;

public class AlternatingCase {
// altERnaTIng cAsE <=> ALTerNAtiNG CaSe
//
//Define String.prototype.toAlternatingCase (or a similar function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language; see the initial solution for details) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example:
//
//StringUtils.toAlternativeString("hello world") == "HELLO WORLD"
//StringUtils.toAlternativeString("HELLO WORLD") == "hello world"
//StringUtils.toAlternativeString("hello WORLD") == "HELLO world"
//StringUtils.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
//StringUtils.toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
//StringUtils.toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
//StringUtils.toAlternativeString("StringUtils.toAlternatingCase") == "sTRINGuTILS.TOaLTERNATINGcASE"
//
//As usual, your function/method should be pure, i.e. it should not mutate the original string.

    public static String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        string = sb.toString();

        return string;
    }
}
