package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class BreakCamelCaseTest {
    @Test
    public void tests() {
        assertEquals( "Incorrect", "camel Casing", new BreakCamelCase().camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", new BreakCamelCase().camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", new BreakCamelCase().camelCase("camelcasingtest"));
    }
}
