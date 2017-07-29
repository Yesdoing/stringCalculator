package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {
	private Calculator cal = new Calculator();

	@Test
	public void add() {
		assertEquals(3, cal.add(2, 1));
	}

	@Test
	public void divide() {
		assertEquals(3, cal.divide(9, 3));
	}
	
	
}
