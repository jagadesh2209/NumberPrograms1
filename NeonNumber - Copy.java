package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
//		int temp=num;
//		int m=num*num;
//		int sum=0;
//		
//		while(m>0)
//		{
//			int rem=m%10;
//			sum+=rem;
//			m/=10;
//		}
//		
//		if(temp==sum)
//		{
//			System.out.println("Its Neon Number");//this like n=9,m=n*n(9*9)=81,and 8+1=9 and 9==9 true.
//		}
//		else {
//			System.out.println("Its not Neon number");
//		}
		
		for(int i=0;i<=num;i++)
		{
			if(neonNumber(i))
			{
				System.out.println(i);// its print only the 0,1,9 because these three numbers only the Neon number whatever number we take  
			}
		}
	}
	public static boolean neonNumber(int num)
	{
		int m=num*num;
		int sum=0,temp=num;
		while(m>0)
		{
			int rem=m%10;
			sum+=rem;
			m/=10;
		}
		if(temp==sum) return true;
		return false;
	}
}
