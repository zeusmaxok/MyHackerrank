package learning;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class StackAndQueue {
	
	public static void main(String[] args) {
		Queue<String> q = new LinkedBlockingQueue<>();
		
		q.offer(new String("abc"));
		
		q.poll(); // retrieve and remove the element at head
		q.peek(); // retrieve but not remove the element at head
		
		Stack<Character> s = new Stack<>();
		
		s.push('a');
		
		s.pop();

		System.out.println(3/2);
	}

}
