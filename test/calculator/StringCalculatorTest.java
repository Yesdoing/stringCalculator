package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	private StringCalculator cal;
	
	@Before
	public void setup() {
		cal = new StringCalculator();
	}
	
	@Test(expected=RuntimeException.class)
	public void error() {
		cal.add("-1,2,3");
	}
	
	@Test
	public void nullCheck() {
		assertEquals(0, cal.add("")); 
		assertEquals(0, cal.add(null));
	}
	
	@Test
	public void oneStr() {
		assertEquals(1, cal.add("1"));
	}
	
	@Test
	public void basicDelimiter() {
		assertEquals(2, cal.add("1,1"));
	}
	
	@Test
	public void customAdd() {
		assertEquals(6, cal.add("//;\n1;2;3"));
	}

}
