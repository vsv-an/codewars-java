package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.*;

// TODO: Replace examples and use TDD development by writing your own tests

public class BeginnerReduceButGrowTest {
    @Test
    public void testSomething() {
        assertEquals(6, BeginnerReduceButGrow.grow(new int[]{1,2,3}));
        assertEquals(16, BeginnerReduceButGrow.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, BeginnerReduceButGrow.grow(new int[]{2,2,2,2,2,2}));
    }
}
