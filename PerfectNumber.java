package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0) 
			{
			  sum=sum+i;
			}
		}
		if(temp==sum) {
			System.out.println(num+ " its Perfect Number");
		}
		else {
			System.out.println(num+ " its not Perfect Number");
		}
	}
}
