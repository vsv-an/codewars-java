package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SimpleFun152InviteMoreWomenTest {
    SimpleFun152InviteMoreWomen Kata = new SimpleFun152InviteMoreWomen();
    @Test
    public void basicTests() {
        assertEquals(true, Kata.inviteMoreWomen(new int[] {1, -1, 1}));
        assertEquals(false, Kata.inviteMoreWomen(new int[] {-1, -1, -1}));
        assertEquals(false, Kata.inviteMoreWomen(new int[] {1, -1}));
        assertEquals(true, Kata.inviteMoreWomen(new int[] {1, 1, 1}));
    }
}
