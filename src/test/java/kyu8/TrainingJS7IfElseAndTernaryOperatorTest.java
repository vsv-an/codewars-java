package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class TrainingJS7IfElseAndTernaryOperatorTest {
    @Test
    public void BasicTests() {
        assertEquals(100,TrainingJS7IfElseAndTernaryOperator.saleHotdogs(1));
        assertEquals(400,TrainingJS7IfElseAndTernaryOperator.saleHotdogs(4));
        assertEquals(475,TrainingJS7IfElseAndTernaryOperator.saleHotdogs(5));
        assertEquals(855,TrainingJS7IfElseAndTernaryOperator.saleHotdogs(9));
        assertEquals(900,TrainingJS7IfElseAndTernaryOperator.saleHotdogs(10));
        assertEquals(9000,TrainingJS7IfElseAndTernaryOperator.saleHotdogs(100));
    }
}
