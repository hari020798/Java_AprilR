package com.java.rev;

public class Demo {

	private void subMethod() {
		this.subMethod1();
		System.out.println("one");
	}

	private void subMethod1() {
		System.out.println("two");
		this.subMethod2();
	
	}

	private void subMethod2() {
		System.out.println("three");
	}

	public static void main(String[] args) {

		Demo a = new Demo();
		a.subMethod();
		
	}

}
