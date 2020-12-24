import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void shouldReturnZeroIfStringIsEmpty(){
        assertEquals(0, Calculator.Add(""));
    }
    @Test
    public void shouldReturnNumberIfStringHaveNumber(){
        assertEquals(1,Calculator.Add("1"));
    }
    @Test
    public void shouldReturnSumIfStringHaveTwoNumberDelimitedByComma(){
        assertEquals(8, Calculator.Add("5,3"));
    }

}
