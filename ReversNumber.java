package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		int r;
		while(n>0)
		{
			r=n%10;
			System.out.print(r);
			n/=10;
		}
	}
}
