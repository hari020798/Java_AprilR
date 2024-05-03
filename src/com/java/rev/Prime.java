package com.java.rev;

public class Prime {
	private static void primeNum() {
		
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=2;j<=i/2;j++) { // 2 98
				if(i%j==0) {
					count++; //1
				}
			}
			if(count ==0) {
				System.out.println("its a prime "+i);
			}
		}
	}
	
	public static void main(String[] args) {
		primeNum();
	}
}
