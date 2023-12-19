package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class PrintTheAllTheNumbersInDownwords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		m1(n);

	}

	public static int m1(int n) {
		if (n == 0) {
			return 0;
		}
		System.out.println(n);
		return m1(n - 1);
	}

}
