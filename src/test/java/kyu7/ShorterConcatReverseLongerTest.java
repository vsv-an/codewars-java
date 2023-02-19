package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShorterConcatReverseLongerTest {
    ShorterConcatReverseLonger ReverseLonger = new ShorterConcatReverseLonger();
    @Test
    public void static1() {
        assertEquals("abcdetsrifabcde",ReverseLonger.shorterReverseLonger("first", "abcde"));
        assertEquals("bauollehbau",ReverseLonger.shorterReverseLonger("hello", "bau"));
        assertEquals("fghiedcbafghi",ReverseLonger.shorterReverseLonger("abcde", "fghi"));
    }
}
