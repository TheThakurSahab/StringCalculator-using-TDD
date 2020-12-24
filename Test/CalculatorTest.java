import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void shouldReturnZeroIfStringIsEmpty(){
        assertEquals(0, Calculator.add(""));
    }
    @Test
    public void shouldReturnNumberIfStringHaveNumber(){
        assertEquals(1,Calculator.add("1"));
    }

}
