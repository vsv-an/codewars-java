package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertABooleanToAStringTest {

    @Test void testTrue(){
        assertEquals("true", ConvertABooleanToAString.convert(true));
    }

    @Test void testFalse(){
        assertEquals("false", ConvertABooleanToAString.convert(false));
    }
}
