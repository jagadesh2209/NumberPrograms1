package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class NextPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		if(isPrime(num)%num==0){
			System.out.println("is prime number"+num);
		}
		else{
			System.out.println("next prime number="+nextPrime(num));
		}
	}   
	
	public static int isPrime(int num)
	{
		int count=0;

		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count!=2) 
		{
			return count;
		}
		return num;
	
	}
	public static int nextPrime(int num)
	{
		num++;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				num++;
				i=2;
			}
			else continue;
		}
		return num;
	}
}
