package kyu8;

import org.apache.commons.lang3.ArrayUtils;

public class AwolfInSheepsClothing {
    public static String warnTheSheep(String[] array) {
        //Your code)))
        if (array[array.length - 1].equals("wolf")) {
            return "Pls go away and stop eating my sheep";
        } else {
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                if (array[i].equals("wolf")) {
                    return "Oi! Sheep number " + j + "! You are about to be eaten by a wolf!";
                }
            }
        }
        return "";
    }
}
