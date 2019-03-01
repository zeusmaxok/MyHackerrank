package hackerrank.solution;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class MyClass {
	
	final static int[] case1 = {1,0,0,0,0,1,0,0};
	final static int[] case2 = {1,1,1,0,1,1,1,1};

	public static void main(String[] args) { 

		List<Integer> result = cellComplete(case2, 2);
		
		System.out.println(result.toString());
		
		System.out.println(myInt());

	}
	
	
	public static List<Integer> cellComplete(int[] states, int days){
		
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		try {
		
		for(int a: states) {
			l1.add(a);
			l2.add(0);
		}
		
		
		
		while(days > 0) {
			for(int index = 0; index < states.length; index++) {
				if(index == 0) {
					l2.set(index, correctState(0, l1.get(index+1).intValue()));
				}else if(index == 7) {
					l2.set(index, correctState(l1.get(index-1).intValue(), 0));
				}else {
					l2.set(index, correctState(l1.get(index-1).intValue(), l1.get(index+1).intValue()));
				}
			}
			
			l1 = new ArrayList<>(l2);
			
			System.out.println(l1.toString());
			System.out.println(l2.toString());
			
			days--;
		}	
		}catch(Exception e) {
			System.out.println(e);
		}
		return l2;
	}
	
	private static int correctState(int left, int right) {
		if(left == right) {
			return 0;
		}else {
			return 1;
		}		
	}
	
	private static int myInt() {
		int[] set = new int[5];
		
		Arrays.fill(set, 0, 5, 5);
		
		return set[4];
	}

}
