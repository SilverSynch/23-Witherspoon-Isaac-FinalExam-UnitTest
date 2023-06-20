import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    // Test that negative numbers throw an IllegalArgumentException.
    @Test
    public void testNegativeNumbers1() {
        String testData = "2, -1";

        assertThrows(IllegalArgumentException.class, () -> {StringCalculator.add(testData);});
    }

    // Test that numbers greater than 1000 are ignored.
    @Test
    public void testNumbersOver1000a() {
        String testData = "2000, 10";

        assertEquals(10, StringCalculator.add(testData));
    }
}
