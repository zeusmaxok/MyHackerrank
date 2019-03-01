package learningSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SetTest {
	
	private Set one;
	private Set many;
	
	@Before
	public void setUp() {
		one = new Set(10);
		many = new Set(5);
		
		many.add(0);
		many.add(1);
		many.add(2);
		many.add(3);
		many.add(4);
		many.add(5);
		many.add(6);
	}

	@Test
	public void isEmptyTest() {	
		
		assertTrue(one.isEmpty());
	}
	
	@Test
	public void addTest() {
		
		assertTrue(one.isEmpty());
		
		one.add(1);
		
		assertFalse(one.isEmpty());
	}
	
	@Test
	public void containsTest() {
		
		
		
		//many.printArray();
		
		assertTrue(many.contains(6));
		assertFalse(many.contains(9));
	}
	
	@Test
	public void sizeTest() {
		
		assertEquals(7, many.size());
	}
	
	@Test
	public void removeTest() {
		
		many.remove(6);
		
		assertFalse(many.contains(6));
	}

}
