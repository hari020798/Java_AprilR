
package com.java.rev;

public class Pattern_space {
	
	public static void main(String[] args) {
		
		for (char i='a'; i<='e'; i++) {
			
		
			for ( char j='a'; j<i; j++) {
				System.out.print(" ");
			}
			
			for (char k=i; k<='e';k++) {
				System.out.print(k + " ");
			
		}
			System.out.println();

	}

}
}