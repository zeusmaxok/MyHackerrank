package MyTest;



import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MyUnitTest.Hiker;
import MyUnitTest.Validator;

class HikerTest {
	
	private static Map<String, Boolean> testCases;
	private Validator hiker;
	
	
	@BeforeAll
	public static void setUpBeforeClass() {
		testCases = new HashMap<String, Boolean>();
		
		//testCases.put("0-321-14653-0", true);
		//testCases.put("0 471 60695 2", true);
		testCases.put("978 0 471 48648 0", true);
	}
	
	@BeforeEach
	public void setUp() {
		hiker = new Hiker();
	}

	// TDD: create test case before coding any logic. The goal is to pass the test case
    @Test
    public void validISBNTest() {
       
       for(Map.Entry<String, Boolean> entry: testCases.entrySet()) {
    	   boolean result = hiker.isValid(entry.getKey());
           
           assertTrue(result == entry.getValue());
       }    
       
    }

}
