package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;
import java.util.stream.*;
import org.apache.commons.lang3.tuple.*;

// TODO: Replace examples and use TDD by writing your own tests

public class OrderedCountOfCharactersTest {
    @Test
    void exampleTests() {
        test("abracadabra", List.of(Pair.of('a', 5), Pair.of('b', 2), Pair.of('r', 2), Pair.of('c', 1), Pair.of('d', 1)));
        test("Code Wars", List.of(Pair.of('C', 1), Pair.of('o', 1), Pair.of('d', 1), Pair.of('e', 1), Pair.of(' ', 1), Pair.of('W', 1), Pair.of('a', 1), Pair.of('r', 1), Pair.of('s', 1)));
        test("233312", List.of(Pair.of('2', 2), Pair.of('3', 3), Pair.of('1', 1)));
    }

    private void test(String text, List<Pair<Character,Integer>> expected) {
        assertEquals(expected, new OrderedCountOfCharacters().orderedCount(text), "For input: \"" + text + "\"");
    }
}
