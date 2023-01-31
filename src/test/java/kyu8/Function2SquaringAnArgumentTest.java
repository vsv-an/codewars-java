package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

public class Function2SquaringAnArgumentTest {
    @Test
    void fixed_tests() {
        assertEquals(4, Function2SquaringAnArgument.square(2));
        assertEquals(2500, Function2SquaringAnArgument.square(50));
        assertEquals(1, Function2SquaringAnArgument.square(1));
    }
}
