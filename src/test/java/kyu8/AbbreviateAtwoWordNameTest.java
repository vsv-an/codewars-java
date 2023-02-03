package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class AbbreviateAtwoWordNameTest {
    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateAtwoWordName.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateAtwoWordName.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateAtwoWordName.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateAtwoWordName.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateAtwoWordName.abbrevName("David Mendieta"));
    }
}
