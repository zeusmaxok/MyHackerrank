package learningSet;

import java.util.Arrays;

public class Set {
	
	int[] set;
	int size;
	int capacity;
	
	public Set(int _capacity) {
		this.capacity = _capacity;
		set = new int[capacity];
		size = 0;
	}

	public boolean isEmpty() {		
		return size == 0;
	}

	public void add(int i) {		
		
		if(size == capacity) {
			set = Arrays.copyOf(set, capacity*2);
		}
		
		set[size] = i;
		
		size++;
		//System.out.println("Size: " + size);
	}

	public boolean contains(int i) {
		for(int x: set) {
			if(x == i) {
				return true;
			}
		}
		return false;
	}
	
	public void printArray() {

		for(int x: set)
			System.out.println(x);
	}

	public int size() {
		
		return size;
	}

	public void remove(int i) {
		
		for(int j = 0; j < size; j++) {
			if(set[j] == i) {
				set[j] = set[size];
			}
		}
		
		size--;
	}	

}
