package kyu8;

import org.junit.*;
import org.junit.rules.*;
import org.junit.runner.Description;

public class YouCantCodeUnderPressure1Test {
    @Test
    public final void test_all() {
        Assert.assertEquals( "Nope!" , 4, YouCantCodeUnderPressure1.doubleInteger(2)); // Test cases here!
    }
}
