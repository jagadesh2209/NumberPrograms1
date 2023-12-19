package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class SumOfPrimeNUmber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (prime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

	public static boolean prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count != 2) {
			return false;
		}
		return true;
	}

}
