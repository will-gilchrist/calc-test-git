package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void multiplicationTest() {
		
		Calculator calc = new Calculator();
		assertEquals("Multiply failed", 8, calc.multiply(2,4));
	}
	
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		assertEquals("Addition failed", 13, calc.add(4,9));
	}

}
