package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Ch4113ng3Test {
    Ch4113ng3 Nerd = new Ch4113ng3();
    @Test
    public void testSomething() {
        assertEquals("Fund4m3nt41s", Nerd.nerdify("Fund4m3nt41s"));
        assertEquals("S3v3n", Nerd.nerdify("Seven"));
        assertEquals("Los 4ng313s", Nerd.nerdify("Los Angeles"));
        assertEquals("S3oijs314wuu3", Nerd.nerdify("Seoijselawuue"));
    }
}
