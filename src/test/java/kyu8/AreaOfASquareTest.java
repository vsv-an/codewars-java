package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class AreaOfASquareTest {
    private static final double DELTA = 1e-15;
    @Test
    public void basicTests() {
        assertEquals(1.62, AreaOfASquare.squareArea(2),DELTA);
        assertEquals(0, AreaOfASquare.squareArea(0),DELTA);
        assertEquals(80, AreaOfASquare.squareArea(14.05),DELTA);
    }
}
