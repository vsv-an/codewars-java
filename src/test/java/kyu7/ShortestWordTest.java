package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Javatlacati on 01/03/2017.
 */

public class ShortestWordTest {
    @Test
    public void findShort() throws Exception {
        ShortestWord Kata = new ShortestWord();
        assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, Kata.findShort("Let's travel abroad shall we"));
    }
}
