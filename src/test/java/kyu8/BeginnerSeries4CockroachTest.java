package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BeginnerSeries4CockroachTest {
    @Test
    public void basicTests() throws Exception{
        BeginnerSeries4Cockroach cockroach = new BeginnerSeries4Cockroach();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
        assertEquals(30, cockroach.cockroachSpeed(1.09));
        assertEquals(0, cockroach.cockroachSpeed(0));
    }
}
