package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SwitchItUpTest {
    @Test
    public void basicTests() {
        assertEquals("One", SwitchItUp.switchItUp(1));
        assertEquals("Three", SwitchItUp.switchItUp(3));
        assertEquals("Five", SwitchItUp.switchItUp(5));
    }
}
