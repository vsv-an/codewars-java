package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindCountOfMostFrequentItemInAnArrayTest {
    FindCountOfMostFrequentItemInAnArray Kata = new FindCountOfMostFrequentItemInAnArray();
    @Test
    public void tests() {
        assertEquals(2, Kata.mostFrequentItemCount(new int[] {3, -1, -1}));
        assertEquals(5, Kata.mostFrequentItemCount(new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }
}
