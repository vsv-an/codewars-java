package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class ReverseWordsTest {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", new ReverseWords().reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", new ReverseWords().reverseWords("apple"));
        assertEquals("a b c d", new ReverseWords().reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", new ReverseWords().reverseWords("double  spaced  words"));
    }
}
