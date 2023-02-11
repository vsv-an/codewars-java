package kyu7;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class RegexpBasicIsItAletterTest {
    RegexpBasicIsItAletter StringUtils = new RegexpBasicIsItAletter();
    @Test
    public void fixedTests() {
        assertFalse(StringUtils.isLetter(""));
        assertTrue(StringUtils.isLetter("a"));
        assertTrue(StringUtils.isLetter("X"));
        assertFalse(StringUtils.isLetter("7"));
        assertFalse(StringUtils.isLetter("*"));
        assertFalse(StringUtils.isLetter("ab"));
        assertFalse(StringUtils.isLetter("a\n"));
    }
}
