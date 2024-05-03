package com.java.rev;

public class DemoC {

	
	private DemoC() {
		this(34);
		System.out.println("one");
	}
	private DemoC(int a) {
		this("hello");
		System.out.println("two "+a);
		
	}
	private DemoC(String c) {
		System.out.println("three "+c);
	}
	public static void main(String[] args) {
		DemoC a = new DemoC();
		

		
	}
	
}
