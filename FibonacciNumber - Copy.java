package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {

//		int a=0;//this is for the normal fibonacciNumber
//		int b=20;
//		int c=0;
//		for(int i=a;i<=b;i++)
//		
//			if(a==0)
//			{
//				c=c+i;
//			}
//		System.out.println(c);
//		}
//	}
//}
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");// this is for the range
		int m = scn.nextInt();
		int n = scn.nextInt();
		int a = 0, b = 1, c;
		if (m == 0) // First value always 0
		{
			System.out.print(a + " " + b);
		}
		while (true) {
			c = a + b;
			if (c > n)
				break;
			if (c >= m) {
				System.out.print(" " + c);
				a = b;
				b = c;
			}
		}
	}
}