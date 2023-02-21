package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class TheFirstNonRepeatCharacterInAStringTest {
    TheFirstNonRepeatCharacterInAString FirstNonRepeated = new TheFirstNonRepeatCharacterInAString();
    @Test
    public void test1() {
        final String input = "test";
        final Character output = FirstNonRepeated.firstNonRepeated(input);
        final Character expected = 'e';
        assertEquals(expected, output);
    }

    @Test
    public void test2() {
        final String input = "teeter";
        final Character output = FirstNonRepeated.firstNonRepeated(input);
        final Character expected = 'r';
        assertEquals(expected, output);
    }

    @Test
    public void test3() {
        final String input = "1122321235121222";
        final Character output = FirstNonRepeated.firstNonRepeated(input);
        final Character expected = '5';
        assertEquals(expected, output);
    }
}
