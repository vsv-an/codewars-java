package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareNsumTest {
    @Test
    public void testBasic()
    {
        assertEquals(9, SquareNsum.squareSum(new int[] {1,2,2}));
        assertEquals(5, SquareNsum.squareSum(new int[] {1,2}));
        assertEquals(50, SquareNsum.squareSum(new int[] {5,-3,4}));
        assertEquals(0, SquareNsum.squareSum(new int[] {}));
    }
}
