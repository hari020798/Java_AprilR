package com.java.rev;

import java.util.Scanner;

public class ScannerPrintContinious {

	Scanner vd = new Scanner(System.in);

	private void UsingStringBuilder() {

		while (true) {
			System.out.println("Enternex the integer to reverse,else, enter 'exit' to close");
			String input = vd.next();

			if (input.equalsIgnoreCase("exit")) {

				System.out.print("Exiting..");

				break;
			}
			int num = Integer.parseInt(input);

			try {

				StringBuilder sb = new StringBuilder();
				sb.append(num);
				StringBuilder reverse = sb.reverse();
				System.out.println(reverse);
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public static void main(String[] args) {

		ScannerPrintContinious spc = new ScannerPrintContinious();
		spc.UsingStringBuilder();
	}
}