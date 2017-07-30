package stringcalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	private StringCalculator cal;
	
	@Before
	public void setup() {
		cal = new StringCalculator();
	}
	
	@Test
	public void basicProcessStr() {
		String str = cal.inputStr();
		String result = cal.basicProcessStr(str);
		assertEquals("4", result);
	}
	
	@Test
	public void customProcessStrTest() {
		String input = "//;\n1;2;3";
		assertEquals("6", cal.customProcessStr(input));
	}
}
