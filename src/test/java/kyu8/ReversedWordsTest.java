package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class ReversedWordsTest {
    @Test
    void sampleTests() {
        assertEquals("world! hello", ReversedWords.reverseWords("hello world!"));
        assertEquals("this like speak doesn't yoda", ReversedWords.reverseWords("yoda doesn't speak like this"));
        assertEquals("foobar", ReversedWords.reverseWords("foobar"));
        assertEquals("editor kata", ReversedWords.reverseWords("kata editor"));
        assertEquals("boat your row row row", ReversedWords.reverseWords("row row row your boat"));
        assertEquals("", ReversedWords.reverseWords(""));
    }
}
