package kyu8;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.runners.JUnit4;

public class BasicMathematicalOperationTest {
    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        assertThat(BasicMathematicalOperation.basicMath("+", 4, 7), is(11));
        assertThat(BasicMathematicalOperation.basicMath("-", 15, 18), is(-3));
        assertThat(BasicMathematicalOperation.basicMath("*", 5, 5), is(25));
        assertThat(BasicMathematicalOperation.basicMath("/", 49, 7), is(7));
    }
}
