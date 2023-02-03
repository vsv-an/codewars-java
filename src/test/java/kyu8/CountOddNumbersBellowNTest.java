package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class CountOddNumbersBellowNTest {
    @Test
    public void fixedTests() {
        assertEquals(7, CountOddNumbersBellowN.oddCount(15));
        assertEquals(7511, CountOddNumbersBellowN.oddCount(15023));
    }
}
