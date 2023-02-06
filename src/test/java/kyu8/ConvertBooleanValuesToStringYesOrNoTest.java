package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ConvertBooleanValuesToStringYesOrNoTest {
    @Test
    public void testBoolToWord() {
        assertEquals(ConvertBooleanValuesToStringYesOrNo.boolToWord(true),"Yes");
        assertEquals(ConvertBooleanValuesToStringYesOrNo.boolToWord(false),"No");
    }
}
