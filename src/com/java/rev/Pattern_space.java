
package com.java.rev;

public class Pattern_space {
	
	public static void main(String[] args) {
		
		for (char i='e'; i>='a'; i--) {
			
		
			for ( char j='e'; j>i; j--) {
				System.out.print(" ");
			}
			
			for (char k=i; k>='a';k--) {
				System.out.print(k + " ");
			
		}
			System.out.println();

	}

}
}