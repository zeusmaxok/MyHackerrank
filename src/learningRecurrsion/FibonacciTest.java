package learningRecurrsion;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test() {
		
		Fibonacci f = new Fibonacci();	
		
		assertEquals(8, f.getFibonacciNumber(5));
	}

}
