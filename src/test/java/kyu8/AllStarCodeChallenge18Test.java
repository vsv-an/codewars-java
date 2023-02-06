package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class AllStarCodeChallenge18Test {
    @Test
    public void testSomething() {
        assertEquals(1, AllStarCodeChallenge18.strCount("Hello", 'o'));
        assertEquals(2, AllStarCodeChallenge18.strCount("Hello", 'l'));
        assertEquals(0, AllStarCodeChallenge18.strCount("",'z'));
    }
}
