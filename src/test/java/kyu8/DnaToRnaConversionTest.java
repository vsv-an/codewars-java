package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DnaToRnaConversionTest {
    @Test
    public void testDna() throws Exception {
        DnaToRnaConversion b = new DnaToRnaConversion();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() throws Exception {
        DnaToRnaConversion b = new DnaToRnaConversion();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }
}
