package com.java.rev;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UpperToLowerString {

	private void usingASCi() {

     String name = "IwasAlwaysRememberTheDayYoukissMyLips";
char []ch = name.toCharArray();


for(int i =1; i<ch.length; i++) {
	
	if(i%2==0) {
	if (ch[i] >= 'a' && ch[i] <= 'z') {
		ch[i] =  (char) (ch[i] - 32);
		
		
	}
	} else if (ch[i] >= 'A' && ch[i] <= 'Z' ) {
		ch[i] = (char) (ch[i] + 32);
	}
	}

name = new String(ch);
System.out.println(name);
	
}
     
     
     //		char[] ch = name.toCharArray();
//
//		for (int i = 0; i < ch.length -18; i++) {
//
//				if (ch[i] >= 'a' && ch[i] <= 'z')
//					ch[i] = (char) (ch[i] - 32);
//		}
//		
//		for (int i = 19; i < ch.length ; i++) {
//
//				if (ch[i] >= 'A' && ch[i] <= 'Z')
//					ch[i] = (char) (ch[i] + 32);
//		}
//
//		name = new String(ch);
//		System.out.println(name);

	//]
	
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
	

private void NumbersofUpperCase_LowerCase(String name) {

		
		char [] ch = name.toCharArray();
		int lowerCase = 0;
		int UpperCase = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
			 lowerCase++;

			}
			else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				UpperCase++;

			} 
			
			

}
		System.out.println("CountLowerCase: " + lowerCase);
		System.out.println("CountUpperCase: " +UpperCase);
		
	}
	public static void main(String[] args) {
		UpperToLowerString ug = new UpperToLowerString();
	    //String name = "My Name Is Hari";
//	    ug.findUpperCase_LowerCase(name); 
	//	ug.NumbersofUpperCase_LowerCase(name);
	    
	    ug.usingSubStringl̥();

	}

}

//
