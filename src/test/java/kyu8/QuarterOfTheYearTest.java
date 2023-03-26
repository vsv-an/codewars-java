package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


// TODO: Replace examples and use TDD by writing your own tests

public class QuarterOfTheYearTest {

    @Test
    public void exampleTests() {
//        Tester.doTest(3, 1);
//        Tester.doTest( 8, 3);
//        Tester.doTest(11, 4);
        assertEquals(1, new QuarterOfTheYear().quarterOf(3));
        assertEquals(3, new QuarterOfTheYear().quarterOf(8));
        assertEquals(4, new QuarterOfTheYear().quarterOf(11));
    }
}
