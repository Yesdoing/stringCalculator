package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {

	@Test
	public void add() {
		Calculator cal = new Calculator();
		assertEquals(3, cal.add(2, 1));
	}

	@Test
	public void divide() {
		Calculator cal = new Calculator();
		assertEquals(3, cal.divide(9, 3));
	}
	
	
}
