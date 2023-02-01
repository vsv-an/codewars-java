package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class PlayingWithCubesITest {
    @Test
    public void testSetToThree() {
        PlayingWithCubesI c = new PlayingWithCubesI();
        c.setSide(3);
        assertEquals(3, c.getSide());
    }
}
