package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReversedStringsTest {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", ReversedStrings.solution("world"));
    }
}
