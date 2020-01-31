package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void add() {
		Calculator cal = new Calculator();
		assertEquals(3, cal.add(1, 2));
	}
	
	@Test
	public void substract() {
		Calculator cal = new Calculator();
		assertEquals(3, cal.substract(5, 2));
	}
	
	@Test
	public void multiply() {
		Calculator cal = new Calculator();
		assertEquals(6, cal.multiply(2, 3));
	}
	
	@Test
	public void divide() {
		Calculator cal = new Calculator();
		assertEquals(3, cal.divide(12, 4));
	}
}
