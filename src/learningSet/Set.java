package learningSet;

import java.util.Arrays;

public class Set <T extends Comparable<T>>{
	
	Object[] set;
	int size;
	int capacity;
	
	public Set(int _capacity) {
		this.capacity = _capacity;
		set = new Object[capacity];
		size = 0;
	}

	public boolean isEmpty() {		
		return size == 0;
	}

<<<<<<< HEAD
	public void add(Object i) {		
=======
	public void add(T i) {		
>>>>>>> refs/remotes/origin/master
		
		if(size == capacity) {
			set = Arrays.copyOf(set, capacity*2);
		}
		
		set[size] = i;
		
		size++;
		//System.out.println("Size: " + size);
	}

	public boolean contains(Object i) {
		for(Object x: set) {
			if(x == i) {
				return true;
			}
		}
		return false;
	}
<<<<<<< HEAD
	
	public void printArray() {

		for(Object x: set)
			System.out.println(x);
	}
=======
>>>>>>> refs/remotes/origin/master

	public int size() {
		
		return size;
	}

<<<<<<< HEAD
	public void remove(Object i) {
=======
	public void remove(T i) {
>>>>>>> refs/remotes/origin/master
		
		for(int j = 0; j < size; j++) {
			if(set[j] == i) {
				set[j] = set[size];
			}
		}
		
		size--;
	}
	
	public void printArray() {

		for(Object x: set)
			System.out.println(x);
	}
}
