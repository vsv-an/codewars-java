package kyu8;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class TheFeastOfManyBeastTest {
    @Test
    public void solutionTest() {
        assertTrue(TheFeastOfManyBeast.feast("great blue heron","garlic nann"));
        assertTrue(TheFeastOfManyBeast.feast("chickadee","chocolate cake"));
        assertFalse(TheFeastOfManyBeast.feast("brown bear","bear claw"));
    }
}
