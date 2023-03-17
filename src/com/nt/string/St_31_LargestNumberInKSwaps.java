package com.nt.string;

import java.util.Arrays;

public class St_31_LargestNumberInKSwaps {

	public static String largestNumber(String str) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		String s = String.valueOf(ch);
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		}
		return s1;
	}

	public static void main(String[] args) {
		String str = "9002063118";
		String res = largestNumber(str);
		System.out.println("Largest Number is::" + res);

	}

}
