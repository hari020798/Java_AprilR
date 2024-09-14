package com.java.rev;



public class Programs {

	private void OddnumToUC() {

		// AnswerShouldbe HaRiHaRaN

		String s = "hariharan";
		
			

		for (int i = 0; i < s.length(); i++) {

			if (i % 2 == 0)
				System.out.print(s.substring(i, i + 1).toUpperCase());
			else
				System.out.print(s.substring(i, i + 1).toLowerCase());

		}
 
	}



	private void ReverseStringMethod() {

		String word = "Hariharan";
		String reverse = "";
		char[] charArray = word.toCharArray();

		for (int i = charArray.length-1; i>=0; i--) {
			reverse = reverse + charArray[i];
			
			
		}
		
		System.out.println("\n" + reverse);

		// }

	}
	public static void main(String[] args) {
		Programs rs = new Programs();
		rs.OddnumToUC();
		rs.ReverseStringMethod();

	}
}
