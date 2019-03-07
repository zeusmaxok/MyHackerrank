package MyUnitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hackerrank.solution.DivisorSum;

public class DivisorSumTest {

	@Test
	public void test() {
		DivisorSum d = new DivisorSum();
		
		assertEquals(12, d.sum(6));
	}

}
