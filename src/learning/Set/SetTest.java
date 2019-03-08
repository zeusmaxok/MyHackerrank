package learning.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SetTest {
	
	private Set<Integer> one;
	private Set<Integer> many;
	
	@Before
	public void setUp() {
		one = new Set<Integer>(10);
		many = new Set<Integer>(5);
		
		many.add(0);
		many.add(1);
		many.add(2);
		many.add(3);
		many.add(4);
		many.add(5);
		many.add(6);
		
		//Collections.sort(many);
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
		
		assertTrue(many.contains(1));
		assertTrue(many.contains(0));
		assertTrue(many.contains(4));
		assertTrue(many.contains(5));
		assertFalse(many.contains(9));
	}
	
	@Test
	public void sizeTest() {
		
		assertEquals(7, many.size());
	}
	
	@Test
	public void removeTest() {
		
		//many.printArray();
		
		many.remove(6);
		many.remove(5);
		many.remove(0);
		
		assertFalse(many.contains(6));
		assertFalse(many.contains(5));
		assertFalse(many.contains(0));
	}

}
