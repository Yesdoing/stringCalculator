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
	
	@Test
	public void add_null_또는_빈문자열() {
		assertEquals(0, cal.add(""));
		assertEquals(0, cal.add(null));
	}
	
	@Test
	public void add_숫자하나() throws Exception {
		assertEquals(1, cal.add("1"));
	}
	
	@Test
	public void add_쉼표구분자() throws Exception {
		assertEquals(3, cal.add("1,2"));
	}
	
	@Test
	public void add_쉼표_또는_콜론_구분자() throws Exception {
		assertEquals(6, cal.add("1,2:3"));
	}
}
