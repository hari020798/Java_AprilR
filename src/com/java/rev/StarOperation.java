package com.java.rev;

import java.util.Scanner;

public class StarOperation {

	Scanner sc = new Scanner(System.in);

	public void starPattern() {
		
		while(true) {
			
			System.out.println("Enter the number to print the star else Enter 'exit' to Exit from the loop");
			
			String input = sc.next();
			
			if (input.equalsIgnoreCase("exit")) {
				
				System.out.println("Exit...");
				
				break;
				
			}
			int num = Integer.parseInt(input);
		for(int i = num; i>=1; i--) {
				for(int j=i; j>=1; j--) {
					System.out.print("*");
				}
				
				
				System.out.println();
			}
		}
	}

		

	public static void main(String[] args) {

		StarOperation ad = new StarOperation();
		ad.starPattern();
	}
}

//	while (true) {
//
//		System.out.println("Enter the Number to print the star, else, Enter 'exit' to close the loop");
//		String input = sc.next();
//
//		if (input.equalsIgnoreCase("exit")) {
//			System.out.println("Exiting......");
//			break;
//
//		}
//
//		int num = Integer.parseInt(input);
//
//		for (int i = 1; i <= num; i++) {
//
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//	}
//
//}