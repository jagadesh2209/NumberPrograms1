package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class CountTheSumOfEvenAndOdd {

	public static void main(String[] args) {

		int even = 0;
		int odd = 0;
		boolean isBoolean = true;
		while (isBoolean) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the numbers");
			int n = sc.nextInt();

			if (n == 0) {
				isBoolean = false;
				System.out.println("Count of even numbers" + even);
				System.out.println("count of odd numbers" + odd);
			} else if (n % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

	}

}
