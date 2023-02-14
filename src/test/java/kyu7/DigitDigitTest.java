package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DigitDigitTest {
    DigitDigit SquareDigit = new DigitDigit();
    @Test
    public void test() {
        assertEquals(811181, SquareDigit.squareDigits(9119));
        assertEquals(0, SquareDigit.squareDigits(0));
    }
}
