package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class PrintTheEvenAndOddNumbers {

	public static void main(String[] args) {

		String even = "";
		String odd = "";
		boolean isBoolen = true;
		while (isBoolen) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the NUmbers");
			int n = sc.nextInt();
			if (n == 0) {
				isBoolen = false;
				System.out.println(even);
				System.out.println(odd);
			} else if (n % 2 == 0) {
				even += n + " ";
			} else {
				odd += n + " ";
			}
		}
	}

}
