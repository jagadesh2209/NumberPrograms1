package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the year");
		int year = scn.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("its leap year");
				} else {
					System.out.println("its not leap year");
				}
			} else {
				System.out.println("its leap year");
			}
		} else {
			System.out.println("its not leap year");
		}
	}
}
