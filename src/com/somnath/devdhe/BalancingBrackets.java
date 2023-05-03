package com.somnath.devdhe;

import java.util.Stack;

public class BalancingBrackets {

	public static void main(String[] args) {

		String input = "[{(}]";

		try {
			String output = isBalanced(input);
			System.out.println(output);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String isBalanced(String input) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == '[' || input.charAt(i) == '{' || input.charAt(i) == '(') {

				stack.push(input.charAt(i));

			} else {
				if (stack.isEmpty()) {
					return "NO";
				} else {
					char pop_val = stack.pop();
					char str = input.charAt(i);

					if (input.charAt(i) != ']' && pop_val == '[') {
						

						return "]";

					} else if (input.charAt(i) != '}' && pop_val == '{') {
						
						return "}";

					} else if (input.charAt(i) != ')' && pop_val == '(') {
						
						return ")";
					}

				}
			}

		}
		if (stack.isEmpty()) {
			return "YES";

		} else {
			return "NO";
		}

	}

}
