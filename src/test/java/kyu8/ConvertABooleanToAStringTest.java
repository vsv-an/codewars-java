package kyu8;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertABooleanToAStringTest {

    @Test void testTrue(){

        assertEquals("true", ConvertABooleanToAString.convert(true));
    }

    @Test void testFalse(){

        assertEquals("false", ConvertABooleanToAString.convert(false));
    }

    @Test void randomTests() {
        Random rand = new Random();
        for (int trial = 0; trial < 40; trial++) {
            boolean val = rand.nextBoolean();
            String  exp = val ? "true" : "false";
            assertEquals(exp, ConvertABooleanToAString.convert(val));
        }
    }
}
