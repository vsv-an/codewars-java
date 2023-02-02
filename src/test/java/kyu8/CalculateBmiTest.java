package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class CalculateBmiTest {
    @Test
    public void testBMI() {
        assertEquals("Normal", CalculateBmi.bmi(80, 1.80));
    }
}
