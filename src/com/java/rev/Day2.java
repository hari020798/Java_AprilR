package com.java.rev;

public class Day2 {

	private static int  reverseOfNum() {
		int a = 123;
		// 321
		int sum = 0;
		while (a > 0) { // 123 12 1
			int rem = a % 10; // 3 2 1

			sum = (sum * 10) + rem; // 0*10 0+3; 3*10 30+3; 32*10 320+1

			a = a / 10; // 12 1 0
		}
		
		return sum;
	}

	private static int sumOfNum() {
		int a = 1234;
		int sum = 0;
		while (a > 0) { // 1234   123  12 1 
			int rem = a % 10;// 4 3 2 1
			

			sum = sum + rem; // 0+1 ;1+

			a = a / 10; // 123 12 1 0
		}     //1234
		      //
		return sum;
	}

	private static void palindromeOfNum() {
		int a = 12321; 
		int temp = a;
		int sum = 0;
		while (a > 0) { //12321 1232 123
			int rem = a % 10; //1  2  3

			sum = (sum * 10) + rem; //0*10 0+1; 1*10 10+2; 12*10 120+3.....12321

			a = a / 10; //1232 //123 //12....
		}

		if (temp == sum) {
		System.out.println("its palindrome");
		} else {
			System.out.println("its not a palindrome");
		}
	}

	private static void primeNum() {
		
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					count++; 
				}
			}
			if(count ==0) {
				System.out.println("its a prime "+i);
			}
		}
	}
	
	
																																																																																																																																																																																																																																																																																																														public static void main(String[] args) {
System.out.println(reverseOfNum());
		System.out.println(sumOfNum());
	palindromeOfNum();
	primeNum();

	}


}
