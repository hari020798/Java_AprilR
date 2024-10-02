package com.java.rev;

import java.util.Scanner;

public class ReverseUsingScanner {
	Scanner sc = new Scanner(System.in);

	private void reverse1() {

		int num = sc.nextInt();

		int rev = 0;

		while (num > 0) { // 1234
			int rem = num % 10;

			rev = (rev * 10) + rem;

			num = num / 10;

		}
		System.out.println("reverseNumIs: " + rev);
	}

	private void usingStringBuffer() {
		int num = sc.nextInt();
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer reverse = sb.reverse();

		System.out.println(reverse);
	}
	private void usingStringBuilder() {
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder();
 sb.append(num);
StringBuilder reverse = sb.reverse();
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		ReverseUsingScanner rc = new ReverseUsingScanner();
		rc.usingStringBuilder();
	}

	
}
