package learning;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class StackAndQueue {
	
	public static void main(String[] args) {
		Queue<String> q = new LinkedBlockingQueue<>();
		
		q.offer(new String("abc"));
		
		q.poll(); // retrieve and remove the element at head
		q.peek(); // retrieve but not remove the element at head
		
		//Stack<Character> s = new Stack<>(); 
		Deque<Character> s = new ArrayDeque<Character>();
		
		
		
		s.push('a');
		s.push('b');
		s.push('c');
		s.push('d');
		s.push('e');
		s.push('f');
		s.push('g');
		
		Iterator<Character> i1 = s.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		//s.pop();

		//System.out.println(3/2);
		
		
	}
	
	
	static void sample() {
		char[] chars = {'a', 'b', 'c'};
		
		String a = new String(chars);
		
		a = a + "Hello";
		
		System.out.println(a);
	}

}

class Ray {
	public String getRay() {return new String("ray");}
	
	int getInt() {
		return 0;
	}
}
