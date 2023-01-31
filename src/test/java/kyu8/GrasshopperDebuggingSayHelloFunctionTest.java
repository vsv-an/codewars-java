package kyu8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GrasshopperDebuggingSayHelloFunctionTest {
    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock",
                GrasshopperDebuggingSayHelloFunction.sayHello("Mr. Spock"));
    }
    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk",
                GrasshopperDebuggingSayHelloFunction.sayHello("Captain Kirk"));
    }
    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura",
                GrasshopperDebuggingSayHelloFunction.sayHello("Liutenant Uhura"));
    }
    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy",
                GrasshopperDebuggingSayHelloFunction.sayHello("Dr. McCoy"));
    }
}
