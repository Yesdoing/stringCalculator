package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {

	@Test
	public void add() {
		Calculator cal = new Calculator();
		int result = cal.add(2, 1);
		assertEquals(3, result);
	}

	@Test
	public void divide() {
		Calculator cal = new Calculator();
		int result = cal.divide(9, 3);
		assertEquals(3, result);
	}
	
	
}
