package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class DontGiveMeFiveTest {
    @Test
    public void exampleTests() {
        assertEquals(8, new DontGiveMeFive().dontGiveMeFive(1,9));
        assertEquals(12, new DontGiveMeFive().dontGiveMeFive(4,17));
    }
}
