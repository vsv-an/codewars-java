package kyu8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Random;

public class IloveYouAlittleAlotPassionatelyNotAtAllTest {
    @Test
    public void test1() {
        assertEquals("I love you", IloveYouAlittleAlotPassionatelyNotAtAll.howMuchILoveYou(1));
        assertEquals("a little", IloveYouAlittleAlotPassionatelyNotAtAll.howMuchILoveYou(2));
        assertEquals("not at all", IloveYouAlittleAlotPassionatelyNotAtAll.howMuchILoveYou(6));
    }
}
