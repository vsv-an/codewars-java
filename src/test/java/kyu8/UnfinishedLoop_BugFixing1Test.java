package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.*;

public class UnfinishedLoop_BugFixing1Test {
    UnfinishedLoopBugFixing1 k = new UnfinishedLoopBugFixing1();

    @Test
    public void SampleTests() {
        assertEquals(Arrays.asList(1), k.CreateList(1));
        assertEquals(Arrays.asList(1,2), k.CreateList(2));
        assertEquals(Arrays.asList(1,2,3), k.CreateList(3));
        assertEquals(Arrays.asList(1,2,3,4), k.CreateList(4));
        assertEquals(Arrays.asList(1,2,3,4,5), k.CreateList(5));
    }
}
