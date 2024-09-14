package com.java.rev;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UpperToLowerString {

	private void usingASCi() {

		String name = "IwasAlwaysRememberTheDayYoukissMyLips";
		System.out.println(name.length());
		char[] ch = name.toCharArray();

		for (int i = 0; i < ch.length -18; i++) {

				if (ch[i] >= 'a' && ch[i] <= 'z')
					ch[i] = (char) (ch[i] - 32);
		}
		
		for (int i = 19; i < ch.length ; i++) {

				if (ch[i] >= 'A' && ch[i] <= 'Z')
					ch[i] = (char) (ch[i] + 32);
		}

		name = new String(ch);
		System.out.println(name);

	}
	
// String name = "Hariharan";
	//
	//char[] ch = name.toCharArray();
	//
	//for (int i = 0; i < ch.length; i++) {
	//
//		if (i % 2 == 0)
//			if (ch[i] >= 'a' && ch[i] <= 'z')
//				ch[i] = (char) (ch[i] - 32);
	//
	//}
	//
	//name = new String(ch);
	//System.out.println(name);


	private void usingSubStringl̥() {
		String name = "abcdefgh";

		for (int i = 0; i < name.length(); i++) {
			if (i % 2 == 0)
				System.out.print(name.substring(i, i + 1).toUpperCase());
			else
				System.out.print(name.substring(i, i + 1).toLowerCase());

		}

	}

	public static void main(String[] args) {
		UpperToLowerString ug = new UpperToLowerString();
		// ug.usingSubStringl̥();
		ug.usingASCi();
	}

}

//
