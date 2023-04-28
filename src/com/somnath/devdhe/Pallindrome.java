package com.somnath.devdhe;

public class Pallindrome {

	public static void main(String[] args) {

		String input = "NITIN";
		int count = 0;
		int len = input.length() - 1;

		for (int i = 0; i < len / 2;i++) {
			if (input.charAt(i) == input.charAt(len - i)) {

				count++;
			}
		}
		if (count == len / 2) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
