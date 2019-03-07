package learning;

import java.time.Duration;
import java.time.Instant;

class JavaPractice {
	
	

	public static void main(String[] args) {

		// Wrapper objects
		Integer num1 = new Integer(10);
		Integer num2 = new Integer("10");

		Integer num3 = Integer.valueOf(10);
		Integer num4 = Integer.valueOf("10");

		System.out.println(num1.equals(num2));// true, compare the value
		System.out.println(num1 == num2);// False, two objects, == is to test value and object

		System.out.println(num3.equals(num4));// true, compare the value
		System.out.println(num3 == num4);// True

		Object numx = num1;
		// num1 = 100;

		System.out.println(numx == num1);
		// True, if only referencing; False if num1 = 100, because num1 is refers to
		// another new object.

		// String
		String str1 = "value";
		String str2 = "value";

		String str3 = "value1";
		String str4 = new String("value1");

		System.out.println("If str1 equals str2: " + (str1 == str2));
		System.out.println("If str1 equals str2 (objects): " + (str3 == str4));
		System.out.println("If str1 equals str2 (value): " + (str3.equals(str4)));
		
		//Instant start = Instant.now();

		//myStringBuffer();
		
		//Instant finished = Instant.now();
		
		//long elasped = Duration.between(start, finished).toMillis();
		
		//System.out.println("Time consumed: " + elasped + "ms");
		
		// Class, Object, State and Behavior
		
		MyClass mc = new MyClass("Ray", "Xu");
		MyClass mc2 = new MyClass("Ray", "Xu");
		
		System.out.println(mc);
		System.out.println(mc.equals(mc2));
	}
	
	public static void myStringBuffer() {
		StringBuffer s3 = new StringBuffer("Value1");
		String s2 = "Value2";
		for (int i = 0; i < 10000000; ++i) {
			s3.append(s2);
		}		
	}

}

class MyClass{
	
	private String fname;
	private String lname;
	
	public MyClass(String f, String l){
		this.fname = f;
		this.lname = l;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyClass [fname=");
		builder.append(fname);
		builder.append(", lname=");
		builder.append(lname);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		MyClass mc = (MyClass)obj;
		
		if(fname == mc.fname && lname == mc.lname) {
			return true;
		}
		
		return false;		
	}
	
	
}
