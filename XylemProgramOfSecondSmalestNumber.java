package com.jsp.BasicNumberPrograms;

public class XylemProgramOfSecondSmalestNumber {

	public static void main(String[] args) {

		int n=400;
		int small=n;
		int Secondsmall=0;
		for(int i=n;i>=1;i--)
		{
			if(m1(i))
			{
				if(i<small)
				{
					Secondsmall=small;
					small=i;
				}
			}
		}
		System.out.println(small);
		System.out.println(Secondsmall);
		
	}
	public static boolean m1(int n)
	{
		int a=0;
		int b=0;
		a+=n%10;
		n/=10;
		while(n>9)
		{
			b+=n%10;
			n/=10;
		}
		a+=n;
		if(a!=b) return false;
		return true;
	}
}
