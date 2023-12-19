package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class XylemNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		int n=sc.nextInt();
		int t=n;
		
		int a=0;
		int b=0;
		
		a+=n%10;
		n/=10;
		while(n>=9)
		{
			b+=n%10;
			n/=10;
		}
		a+=n;
		if(a==b)
		{   
			System.out.println(t+ " Xylem Number");
		}
		else {
			System.out.println(t+" Its not Xylem Number");
		}
	}
}
