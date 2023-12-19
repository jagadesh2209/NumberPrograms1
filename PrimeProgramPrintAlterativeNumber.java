package com.jsp.BasicNumberPrograms;

import java.util.Iterator;

public class PrimeProgramPrintAlterativeNumber {

	public static void main(String[] args) {
		int n=20;
		for(int i=2;i<=n;i++)
		{
			if(m1(i))
			{
				System.out.println(i);
			}
		}
		System.out.println("**************");
		boolean b=false;
		for(int i=2;i<=n;i++)
		{
			if(m1(i))
			{
				b=!b;
				if(b)
				{
					System.out.println(i);
				}
			}
		}
	}
	public static boolean m1(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count!=2) return false;
		return true;
	}
}
