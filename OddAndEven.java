package com.jsp.BasicNumberPrograms;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(i%2==0){
				System.out.println("even number=" +i);
			}
			else {
				System.out.println("odd number="+ i);
			}
		}

	}

}
