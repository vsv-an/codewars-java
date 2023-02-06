package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class TheWideMouthedFrogTest {
    @Test
    public void fixedTests() {
        assertEquals("wide", TheWideMouthedFrog.mouthSize("toucan"));
        assertEquals("wide", TheWideMouthedFrog.mouthSize("ant bear"));
        assertEquals("small", TheWideMouthedFrog.mouthSize("alligator"));
    }
}
