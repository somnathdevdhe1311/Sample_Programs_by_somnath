package com.somnath.devdhe;

public class SecondHighestNumber {

	public static void main(String[] args) {

		int arr[] = { 105 ,11, 3, 45, 22, 76, 89, 99};
		int max = 0, secMax = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];
			}
		}
		System.out.println(max);
		for (int j = 0; j < arr.length; j++) {

			if (arr[j] > secMax && arr[j] != max) {

				secMax = arr[j];
			}
		}

		System.out.println(secMax);
	}

}
