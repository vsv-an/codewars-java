package kyu7;

import java.util.*;
import org.apache.commons.lang3.tuple.Pair;

/*
Count the number of occurrences of each character and return it as a (list of tuples) in order of appearance. For empty output return (an empty list).

Consult the solution set-up for the exact data structure implementation depending on your language.

Example:

ordered_count("abracadabra") == [('a', 5), ('b', 2), ('r', 2), ('c', 1), ('d', 1)]

 */

public class OrderedCountOfCharacters {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
        List<Pair<Character, Integer>> list = new ArrayList<>();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
           list.add(Pair.of(e.getKey(), e.getValue()));
        }
        System.out.println(map);
        return list;
    }
}
