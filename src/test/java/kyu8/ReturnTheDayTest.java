package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

public class ReturnTheDayTest {
    @Test
    void testSomething() {
        assertEquals("Sunday",ReturnTheDay.getDay(1));
        assertEquals("Monday",ReturnTheDay.getDay(2));
        assertEquals("Tuesday",ReturnTheDay.getDay(3));
        assertEquals("Wrong, please enter a number between 1 and 7",ReturnTheDay.getDay(8));
        assertEquals("Wrong, please enter a number between 1 and 7",ReturnTheDay.getDay(20));
    }
}
