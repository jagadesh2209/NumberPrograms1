package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class PrimeNumbrRange {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the Prime Number");// number only divisible by 1 and it self only
		int range = scn.nextInt();
		int count = 0;

		for (int i = 2; i <= range; i++) {
			if (prime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean prime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count != 2) {
			return false;
		}
		return true;
	}
}
