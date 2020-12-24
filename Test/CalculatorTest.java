import org.junit.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void shouldReturnZeroIfStringIsEmpty(){
        assertEquals(0, Calculator.Add(""));
    }

    @Test
    public void shouldReturnNumberIfStringHaveNumber(){
        assertEquals(1,Calculator.Add("1"));
        assertEquals(5,Calculator.Add("5"));
    }

    @Test
    public void shouldReturnSumIfStringHaveTwoNumberDelimitedByComma(){
        assertEquals(8, Calculator.Add("5,3"));
        assertEquals(10, Calculator.Add("7,3"));
    }
    @Test
    public void shouldReturnSumIfStringHaveMultipleNumber(){
        assertEquals(12,Calculator.Add("6,4,2"));
        assertEquals(15,Calculator.Add("6,5,4"));
    }
    @Test
    public void shouldReturnSumIfStringHaveTwoNumberDelimitedBySpecialChar(){
        assertEquals(11, Calculator.Add("8\n3"));
    }

}
