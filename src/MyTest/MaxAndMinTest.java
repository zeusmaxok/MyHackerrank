package MyTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MyUnitTest.MaxAndMin;

public class MaxAndMinTest {
	
	private MaxAndMin t;
	private int[] SAMPLE;
	private static final Logger log = Logger.getLogger(MaxAndMinTest.class.getName());
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		log.info("@BeforeClass: runs one time, before any tests in this class");
		
	}
	
	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		log.info("@AfterClass: runs one time, after all tests in this class");
	}
	
	@BeforeEach
	public void setUp() throws Exception {
		log.info("@Before: runs before each test in this class.");
		
		t = new MaxAndMin();
		
		SAMPLE = new int[]{10, 20, 30, 40, 50};
	}
	
	@AfterEach
	public void tearDown() throws Exception {
		log.info("@After: runs after each test in this class.");
	}
	
	@Test
	public void MaxTest() {		
		
		int result = t.maxSum(SAMPLE);
		
		assertTrue(result == 140);
	}
	
	@Test
	public void MinTest() {
		
		int result = t.minSum(SAMPLE);
		
		assertTrue(result == 100);
		
	}
	
	@Test
	public void SquareA() {
		
		int result = t.square(5);
		
		assertTrue(result == 25);
	}

}
