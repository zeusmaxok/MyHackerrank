package hackerrank.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Testt {
	
	private int t = 10000;
	
	public static void main(String[] args) {
		float a = (float) 2.19, b = (float) 2.23;
		
		System.out.println((int)(a + b));
		
		
		int[] abc = new int[5];
		
		int c = 100;
		
		int l = String.valueOf(c).length();
		
		
		List<ArrayList<String>> namesAndNumbers = new ArrayList<ArrayList<String>>();
		namesAndNumbers.add(new ArrayList<String>(Arrays.asList("Mike", "(805) 766-4920")));
		namesAndNumbers.add(new ArrayList<String>(Arrays.asList("Emily", "(705) 668-9292", "(705) 555-1060")));
		namesAndNumbers.add(new ArrayList<String>(Arrays.asList("James", "(605) 965-2000")));
		Collections.sort(namesAndNumbers, new Comparator<ArrayList<String>>() {    
		        @Override
		        public int compare(ArrayList<String> o1, ArrayList<String> o2) {
		            return o1.get(0).compareTo(o2.get(0));
		        }               
		});
		
		
		System.out.println(namesAndNumbers);
		
		
		String x = "abc";
		String y = new String("abc");
		
		System.out.println(x.equals(y));
		
		Integer num1 = new Integer(1);
		Integer num2 = num1;
		
		num1 += 1;
		
		System.out.println(num1);
		System.out.println(num2);
	}
	
	public static void myM() {
		
		Integer a = new Integer("asdf");
		
		
		
		System.out.println(a);
	}

}
