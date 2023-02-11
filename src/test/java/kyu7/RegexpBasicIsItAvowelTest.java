package kyu7;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class RegexpBasicIsItAvowelTest {
    RegexpBasicIsItAvowel StringUtils = new RegexpBasicIsItAvowel();
    @Test
    public void fixedTests() {
        assertFalse(StringUtils.isVowel(""));
        assertTrue(StringUtils.isVowel("a"));
        assertTrue(StringUtils.isVowel("E"));
        assertFalse(StringUtils.isVowel("ou"));
        assertFalse(StringUtils.isVowel("z"));
        assertFalse(StringUtils.isVowel("lol"));
    }
}
