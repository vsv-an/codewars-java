package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class MakeUpperCaseTest {
    MakeUpperCase upper = new MakeUpperCase();

    @Test
    public void testSomething() {
        assertEquals("HELLO",upper.MakeUpperCase("hello"));
    }
}
